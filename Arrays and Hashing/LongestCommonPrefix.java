import java.util.Arrays;

public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder desired=new StringBuilder();
            Arrays.sort(strs);
            String one=strs[0];
            String two=strs[strs.length-1];

            int idx=0;
            while(idx<one.length()&&idx<two.length()){
                if(one.charAt(idx)==two.charAt(idx)){
                    desired.append(one.charAt(idx));
                    idx++;
                }
                else{
                    break;
                }
            }
            return desired.toString();
        }
    }
}
