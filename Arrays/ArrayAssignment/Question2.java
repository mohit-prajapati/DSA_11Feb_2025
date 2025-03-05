package Arrays.ArrayAssignment;

public class Question2 {

    // Smallest element index in the array
    public static int minSearch(int[] nums)
    {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid > 0 && nums[mid-1] > nums[mid]) {
                return mid;
            }else if (nums[start] <= nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }

    // Binary search to find the target in left to right boundary
    public static int search(int[] nums, int left, int right, int key)
    {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == key) {
                return mid;
            }else if (nums[mid] > key) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return -1;
    }
    
    public static int findTheTargetValue(int nums[], int key)
    {
        // min will have index of smallest element in nums
        int min = minSearch(nums);

        // find in sorted left
        if (nums[min] <= key && key <= nums[nums.length-1]) {
            return search(nums, min, nums.length-1, key);
        }else{
            // find in sorted right
            return search(nums, 0, min, key);
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int key = 0;
        System.out.println("The key is exist in index of " + findTheTargetValue(nums, key));
    }
}
