package DivideAndConquer.PracticeQuestions;

public class Question2 {
    // Q: Given an array nums of size n, return the majority element. (MEDIUM)
    // The majority element is the element that appears more then [n/2] times. you
    // may assume that the majority element always exists in the array.
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr, 0, arr.length - 1));
    }

    public static int countInRange(int[] nums, int target, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int majorityElement(int[] nums, int startIdx, int endIdx) {
        // base case
        if (startIdx == endIdx) {
            return nums[startIdx];
        }

        // work
        int mid = startIdx + (endIdx - startIdx) / 2;
        // left part
        int leftMajority = majorityElement(nums, startIdx, mid);
        // right part
        int rightMajority = majorityElement(nums, mid + 1, endIdx);

        // if the two halves agree on the majority element, return it
        if (leftMajority == rightMajority) {
            return leftMajority;
        }

        // otherwise, count each element in the "winner"
        int leftCount = countInRange(nums, leftMajority, startIdx, endIdx);
        int rightCount = countInRange(nums, rightMajority, startIdx, endIdx);

        return leftCount > rightCount ? leftMajority : rightMajority;
    }
}
