class Solution { // 2 pointer and hashset along with overlapping pointer initially
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        HashSet<Character> valid = new HashSet<>();
        char[] split = s.toCharArray();
        int left = 0;
        int right = 0;

        int maxCount = 1;

        while(!(right > split.length - 1)){
            while(valid.contains(split[right])){
                valid.remove(split[left]);
                left++;
                maxCount = Math.max(maxCount, valid.size());
            }
            valid.add(split[right]);
            right++;
            maxCount = Math.max(maxCount, valid.size());
            }
        return maxCount;
    }
        
}
