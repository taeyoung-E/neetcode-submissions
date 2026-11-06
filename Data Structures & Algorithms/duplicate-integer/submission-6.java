class Solution {
    public boolean hasDuplicate(int[] nums) {
        //HashSet implementation
        HashSet<Integer> container = new HashSet<>();

        for(int num : nums){
            if(container.contains(num)) return true;
            container.add(num);
        }
        return false;
    }
}