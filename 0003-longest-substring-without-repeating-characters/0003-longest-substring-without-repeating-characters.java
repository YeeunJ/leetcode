class Solution {
    public int lengthOfLongestSubstring(String s) {
        int index1 = 0;
        int index2 = 0;
        int len = s.length();
        int maxLen = 0;

        HashMap<Character, Integer> alphabet = new HashMap<>();

        while(index1 < len && index2 < len) {
            char curChar = s.charAt(index2);

            if(!alphabet.containsKey(curChar)) {
                alphabet.put(curChar, -1);
            }

            if(alphabet.get(curChar) != -1) {
                int nextIndex1 = alphabet.get(curChar)+1;
                for(int i = index1; i < nextIndex1; i++) {
                    alphabet.put(s.charAt(i), -1);
                }
                index1 = nextIndex1;
            }

            alphabet.put(curChar, index2);

            if(maxLen < index2 - index1 + 1) {
                maxLen = index2 - index1 + 1;
            }
            index2++;
        }

        return maxLen;
    }
}