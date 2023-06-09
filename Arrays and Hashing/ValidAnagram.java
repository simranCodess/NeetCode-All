import java.util.*;

public class ValidAnagram {
    public boolean isAnagaram(String s, String t) {
        HashMap<Character, Integer> stringOne = new HashMap<>();

        if (t.length() != s.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            int frequency = 0;
            if (stringOne.get(s.charAt(i)) != null) {
                frequency = stringOne.get(s.charAt(i));
            }
            stringOne.put(s.charAt(i), frequency++);
        }

        for (int j = 0; j < t.length(); j++) {
            int frequency2 = 0;
            if (stringOne.get(t.charAt(j)) == null) {
                return false;
            } else {
                frequency2 = stringOne.get(t.charAt(j));
                stringOne.put(t.charAt(j), frequency2--);
            }
            if (stringOne.get(t.charAt(j)) < 0) {
                return false;
            }
        }

        return true;
    }
}
