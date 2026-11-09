class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagramResult = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] container = strs[i].toCharArray();
            Arrays.sort(container);
            String key = new String(container);
            
            if(!anagramResult.containsKey(key)){
                anagramResult.put(key,new ArrayList<>());
            }
            anagramResult.get(key).add(strs[i]);
        }

        return new ArrayList<>(anagramResult.values());
        //The idea of sorting each string and using that sorted sequence as a key
    }
}
