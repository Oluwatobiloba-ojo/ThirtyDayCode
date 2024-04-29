public class SearchInsertPosition {


    public static int searchInsert(int[] nums, int targets) {
        int index;
        for (index = 0; index < nums.length; index++) if (nums[index] >= targets) return index;
        return index;
    }
}
