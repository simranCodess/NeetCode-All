import java.util.*;
public class LongestConsecutiveSequence {
    public int longestConsecutive(int [] nums){
        //storing nums in a set
        Set <Integer> set= new HashSet<>();
        int longestSeq=0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int i=0; i<nums.length;i++){
            //checking if start of the sequence, does not contain a left neighbour
            if(!set.contains(nums[i]-1)){
                int length=0;
                while(set.contains(nums[i]+length)){
                    length++;
                }
                longestSeq=Math.max(longestSeq,length);
            }
        }
        return longestSeq;
    }
}
