import java.util.*;
public class ProductOfArrayExceptSelf {
    public int [] productExceptSelf(int [] nums){
        int [] result= new int [nums.length];
        int prefix=1;
        for(int i=0; i<nums.length;i++){
           if(i==0){
               result[0]=1;
           }
           else{
               prefix=prefix*nums[i-1];
               result[i]=prefix;
           }
        }
        System.out.println(Arrays.toString(result));
        int postfix=1;
        for(int i=nums.length-1; i>=0;i--){
            result[i]=result[i]*postfix;
            postfix*=nums[i];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
