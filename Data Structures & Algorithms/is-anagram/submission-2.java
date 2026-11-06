class Solution {
    public boolean isAnagram(String s, String t) {
        //So first check if they're the same length
        if(s.length() != t.length()) return false;

        //Then length are the same beyond this point

        //If the count for the HashMap value for each character isn't an even number,
        //It's not an anagram

        HashMap<Character,Integer> container = new HashMap<>();
        HashMap<Character,Integer> container2 = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            container.put(s.charAt(i),container.getOrDefault(s.charAt(i),0) + 1);
            container2.put(t.charAt(i),container2.getOrDefault(t.charAt(i),0) + 1);
        }
        return container.equals(container2); // Use the equals method for comparing hashmap contents.

    }
}
