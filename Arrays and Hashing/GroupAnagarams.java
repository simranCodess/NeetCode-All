import java.util.*;

public class GroupAnagarams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> list= new HashMap<>();
        for(int i=0; i<strs.length;i++){
            char [] arr= strs[i].toCharArray();
            Arrays.sort(arr);
            String s= String.valueOf(arr);
            if(!list.containsKey(s)){
                list.put(s,new ArrayList<>());
            }
            list.get(s).add(strs[i]);
        }
        return new ArrayList<>(list.values());
    }

}
