class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
            return false;
        HashSet<Integer> check = new HashSet<>();

        check.add(nums[0]);

        for(int i = 1; i < nums.length; i++){
            if(check.contains(nums[i])){
                return true;
            }
            check.add(nums[i]);
        }
        return false;

    }
}