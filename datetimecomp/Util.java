package practise.datetimecomp;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Util {

    public static LocalDateTime normalize(String input, boolean endOfPeriod) {

        // yyyy-MM-dd'T'HH:mm:ss
        if (input.matches("\\d{4}-\\d{2}-\\d{2}.*")) {
            return LocalDateTime.parse(input);
        }

        // yyyy-MM-dd
        if (input.matches("\\d{4}-\\d{2}-\\d{2}")) {
            LocalDate d = LocalDate.parse(input);
            return endOfPeriod
                    ? d.atTime(23, 59, 59)
                    : d.atStartOfDay();
        }

        // yyyy-MM
        if (input.matches("\\d{4}-\\d{2}")) {
            YearMonth ym = YearMonth.parse(input);
            LocalDate d = endOfPeriod
                    ? ym.atEndOfMonth()
                    : ym.atDay(1);
            return endOfPeriod
                    ? d.atTime(23, 59, 59)
                    : d.atStartOfDay();
        }

        // yyyy
        if (input.matches("\\d{4}")) {
            int year = Integer.parseInt(input);
            LocalDate d = endOfPeriod
                    ? LocalDate.of(year, 12, 31)
                    : LocalDate.of(year, 1, 1);
            return endOfPeriod
                    ? d.atTime(23, 59, 59)
                    : d.atStartOfDay();
        }

        throw new IllegalArgumentException("Unsupported date format: " + input);
    }
}
