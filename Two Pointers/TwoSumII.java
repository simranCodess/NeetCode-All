
import java.util.*;
public class TwoSumII {
    public int [] twoSum(int [] numbers, int target){
        HashMap<Integer,Integer> newmap= new HashMap<>();
        for(int i=0; i<numbers.length;i++){
            int diff=target-numbers[i];
            if(newmap.containsKey(diff)){
                return new int []{newmap.get(diff)+1,i+1};
            }
            newmap.put(numbers[i],i);
        }
        return null;
    }
}
