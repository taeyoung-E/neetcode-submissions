class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> container = new HashMap<>();
        String[] org = strs;
        for(int i = 0; i < strs.length; i++){
            char[] keyFormat = org[i].toCharArray();
            Arrays.sort(keyFormat);
            String key = new String(keyFormat);
            if(container.containsKey(key) == false){
                container.put(key,new ArrayList<>());
                container.get(key).add(org[i]);
            }
            else{
                container.get(key).add(org[i]);
            }
        }
        List<List<String>> result = new ArrayList<>(container.values());
        return result;
    }
}
