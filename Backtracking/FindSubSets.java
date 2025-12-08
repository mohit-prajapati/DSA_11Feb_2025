package Backtracking;

class FindSubSets {
    public static void findSubSets(String str, String ans, int idx) {
        // Base Case
        if (idx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Choose Yes
        findSubSets(str, ans + str.charAt(idx), idx + 1);
        // Choose No
        findSubSets(str, ans, idx + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSets(str, "", 0);
    }
}