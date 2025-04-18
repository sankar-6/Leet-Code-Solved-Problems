import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int max=Math.max(word1.length(),word2.length());
        for(int i=0;i<max;i++){
            if(i<word1.length()){
                merge.append(word1.charAt(i));
            }
            if(i<word2.length()){
                merge.append(word2.charAt(i));
            }
        }
        return merge.toString();
    }
        
}
