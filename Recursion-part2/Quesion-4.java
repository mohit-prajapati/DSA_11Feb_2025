// Question4:WearegivenastringS,weneedtofindthecountofallcontiguoussubstringsstarting and ending with the same character.

class Question4 {

    public static int countSubstrings(String s, int i, int j, int n) {
        if (n == 1)
            return 1;

        if (n <= 0) {
            return 0;
        }

        int res = countSubstrings(s, i + 1, j, n - 1) + countSubstrings(s, i, j - 1, n - 1)
                - countSubstrings(s, i + 1, j - 1, n - 2);

        if (s.charAt(i) == s.charAt(j)) {
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "aba";
        int n = s.length();
        System.out.print(countSubstrings(s, 0, n - 1, n));
    }
}