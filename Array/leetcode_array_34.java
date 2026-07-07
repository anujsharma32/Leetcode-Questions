public class leetcode_array_34 {
     public static int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {

                int j = i;
                while (j + 1 < n && nums[j + 1] == target) {
                    j++;
                }

                return new int[]{i, j};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int [] ans=leetcode_array_34.searchRange(new int[]{1,2,3,3,4,4,5},4);
        for(int el : ans){
            System.out.print(el+" ");
        }
    }
}
    
