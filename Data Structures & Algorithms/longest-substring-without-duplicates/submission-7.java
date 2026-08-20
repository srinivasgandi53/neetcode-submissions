class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left =0;
   
        Set<Character> mySet = new HashSet<>();
        String longString = "";

        int maxLength = 0;
        
        for(int right = 0 ; right < s.length(); right ++ ){
         
         while (mySet.contains(s.charAt(right))) {
            mySet.remove(s.charAt(left));
            left ++;
         }
            mySet.add(s.charAt(right))  ;
         

        if (right - left + 1 > maxLength) {
            maxLength = right - left + 1;
            longString = s.substring(left, right + 1);
        }

        }
        
        return longString.length();
    }
}
