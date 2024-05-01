public class MaximumSumOfSubArray {


    public static long maximumSubarraySum(int[] nums, int k) {
        if (nums.length <= k & !checkIndex(nums, 0, k)) return 0;
        long sum = sum_up(nums, 0, k);
        if(nums.length == k) return sum;
        long currentSum = sum;
        if (!checkIndex(nums, 0, k)) sum = 0;
        for (int i = 0; i < nums.length-k; i++) {
            currentSum = currentSum - nums[i] + nums[i + k];
            if(checkIndex(nums, i+1, k)){
                if (currentSum > sum) sum = currentSum;
            }
        }
        return sum;
    }

    private static long sum_up(int[] nums, int i, int k) {
        long result = 0;
        for (int index = i; index < i+k; index++) {
            result += nums[index];
        }
        return result;
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
