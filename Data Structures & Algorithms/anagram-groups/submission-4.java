class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> answer = new HashMap<>();

        for(String s : strs){
            String key = frequencyStr(s);
            if(!answer.containsKey(key)){
                answer.put(key,new ArrayList<>());
            }
            answer.get(key).add(s);
        }
        return new ArrayList<>(answer.values());
    }
    
    private String frequencyStr(String str){
        int[] freq = new int[26];
        for(char c : str.toCharArray()){
            freq[c -'a']++;
        }
        char start = 'a';
        StringBuilder key = new StringBuilder();
        for(int i = 0; i < freq.length; i++){
            key.append(start).append(freq[i]);
            start++;
        }
        return key.toString();
    }
}
