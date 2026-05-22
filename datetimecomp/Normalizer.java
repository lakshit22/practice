package practise.datetimecomp;

import java.time.LocalDateTime;

public class Normalizer {
    public static void main(String[] args) {
        String d1 = "2026-02";                 // month only
        String d2 = "2026-02-05T10:00:00";     // full datetime

        LocalDateTime y = Util.normalize("2026", false);
        LocalDateTime d = Util.normalize("2026-06-15", false);

        LocalDateTime ans1 = Util.normalize(d1,false);
        LocalDateTime ans2 = Util.normalize(d2,false);

        System.out.println(ans1.isBefore(ans2));
        System.out.println(y.isBefore(d)); // true
    }
}
