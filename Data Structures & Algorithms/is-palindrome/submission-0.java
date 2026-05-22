class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = a.toCharArray();
        int start = 0;
        int end = a.length() - 1;

        while(start < end){
            if(arr[start] == arr[end]){
                start++;
                end--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
