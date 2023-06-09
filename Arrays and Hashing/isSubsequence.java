import java.util.*;
public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true; // Empty string is a subsequence of any string
        }

        s = s.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        t = t.toLowerCase();
        int sPtr=0;
        int tptr=0;
        while(sPtr<s.length()&&tptr<t.length()){
            if(s.charAt(sPtr)==t.charAt(tptr)){
                sPtr++;
                tptr++;
            }
            else{
                tptr++;
            }
        }
        if(sPtr==s.length()){
            return true;
        }
        else{
            return false;
        }

    }
}
