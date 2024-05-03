public class Tribonacci {

    public static int tribonacci(int n) {
        int[] nums = new int[37];
        nums[0] = 0; nums[1] = 1; nums[2] = 1;
        if (n == 0) return 0;
        else if (n == 1 || n == 2) return 1;
        int starting = 0;
        int index = 0;
        while (starting != n){
            starting = index + 3;
            nums[starting] = nums[starting-1] + nums[starting-2] + nums[starting-3];
            index++;
        }
        return nums[index+2];
    }
}
