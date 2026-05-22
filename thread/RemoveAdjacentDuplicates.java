package practise.thread;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "bxd daaccce";

        while (true) {
            StringBuilder sb = new StringBuilder();
            boolean removed = false;

            for (int i = 0; i < str.length(); ) {
                int j = i + 1;

                while (j < str.length() && str.charAt(i) == str.charAt(j))
                    j++;

                if (j - i == 1)
                    sb.append(str.charAt(i));
                else
                    removed = true;

                i = j;
            }

            if (!removed) break;

            str = sb.toString();
            System.out.println(str);
        }

        System.out.println("Output: " + str);
    }
}