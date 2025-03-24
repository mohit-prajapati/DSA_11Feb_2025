package Strings;

public class compareString {
    // with stringBulider
    public static String compress(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }

        return sb.toString();
    }

    // Without stringBulider
    public static String compress2(String str)
    {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr += str.charAt(i);

            if (count > 1) {
                newStr += count.toString();
            }
        }

        return newStr;
    }
    public static void main(String[] args) {
        String str = "aaabbccccddddd";

        System.out.println(compress(str));
    }
}
