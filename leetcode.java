public class leetcode {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 2, 3, 1};
        System.out.println(containsDuplicate(nums, 3));
    }



    public static boolean containsDuplicate(int[] nums, int k) {
        for(int L = 0; L < nums.length; L++) {
            for(int R = L + 1; R < Math.min(nums.length, L + k); R++) {
                if(nums[L] == nums[R]) {
                    return true;
                }
            }
        }
        return false;
    }
}