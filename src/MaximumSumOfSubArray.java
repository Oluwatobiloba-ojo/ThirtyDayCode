public class MaximumSumOfSubArray {


    public static int maximumSubarraySum(int[] nums, int k) {
        int sum = nums[0] + nums[1] + nums[2];
        int currentSum;
        for (int i = 0; i < nums.length-k; i++) {
            if(checkIndex(nums, i+1, k)) {
                currentSum = sum - nums[i] + nums[i+k];
                if (currentSum > sum) sum = currentSum;
            }
        }
        return sum;
    }

    private static boolean checkIndex(int[] nums, int i, int k) {
        int jump = k+i;
        for (int index = i; index < jump; index++) {
            for (int innerIndex = index+1; innerIndex < jump; innerIndex++) {
                if (nums[index] == nums[innerIndex]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int i = 3;
        int k = 3;
        System.out.println(checkIndex(nums, i, k));
    }


}
