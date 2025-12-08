public class Testing {
    public int getSecondLargest(int[] arr) {
        // code here

        int flargest = arr[0], slargest = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (temp > flargest) {
                flargest = temp;
            } else if (slargest <= temp && flargest > slargest) {
                slargest = temp;
            }

            // System.out.print(" flargest: " + flargest + " slargest: " + slargest);
        }

        if (slargest != 0 && slargest < flargest) {
            return slargest;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Testing testing = new Testing();
        int[] arr = { 10, 5, 10 };
        System.out.println(testing.getSecondLargest(arr));
    }
}
