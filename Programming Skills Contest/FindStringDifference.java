class Solution {
    public char findTheDifference(String s, String t) {
        int diff=0;
        for(char ch : s.toCharArray()) {
            diff ^= ch;
        }
        for(char ch : t.toCharArray()) {
            diff ^= ch;
        }
        return (char) diff;
    }

}
