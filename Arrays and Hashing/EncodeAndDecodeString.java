
import java.util.*;
public class EncodeAndDecodeString {

    public String encode(String [] one){
        String encoded="";
        for(int i=0; i<one.length;i++){
            encoded+=one[i].length()+"#"+one[i];
        }
        return encoded;

    }

    public String[] decode(String one) {
        List<String> resultList = new ArrayList<>();
        int i = 0;
        while (i < one.length()) {
            int j = i;
            StringBuilder length = new StringBuilder();
            StringBuilder word = new StringBuilder();
            while (j < one.length() && one.charAt(j) != '#') {
                length.append(one.charAt(j));
                j++;
            }
            for (int y = j + 1; y < j + 1 + Integer.parseInt(length.toString()); y++) {
                word.append(one.charAt(y));
            }
            resultList.add(word.toString());
            i = j + 1 + Integer.parseInt(length.toString());
        }
        return resultList.toArray(new String[0]);
    }


}
