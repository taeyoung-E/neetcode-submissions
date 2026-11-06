class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2) return new int[]{0,1};

        HashMap<Integer,Integer> container = new HashMap<>();
        container.put(nums[0], 0); // K = Value, V = Index
        int[] answer = new int[2];

        for(int i = 1; i < nums.length; i++){
            int testValue = target - nums[i];
            if(container.containsKey(testValue)){
                answer[0] = Math.min(i,container.get(testValue));
                answer[1] = Math.max(i,container.get(testValue));
            }
            container.put(nums[i],i);
        }
        return answer;

    }
}
