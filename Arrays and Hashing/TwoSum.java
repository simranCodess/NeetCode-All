
import java.util.*;
public class TwoSum {

    public static int [] twoSum(int [] nums, int target) {
        HashMap<Integer, Integer> desired = new HashMap<>();
        int diff=0;
        for(int i=0; i<nums.length;i++){
            diff=target-nums[i];
            if(desired.get(diff)!=null){
                return new int [] {desired.get(diff),i};
            }
            desired.put(nums[i],i);
        }
        return null;
    }

}
