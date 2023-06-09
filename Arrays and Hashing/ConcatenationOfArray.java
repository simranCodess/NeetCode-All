public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int [] desired= new int [2*nums.length];

        for(int i=0; i<2*nums.length;i++){
            if(i<nums.length){
                desired[i]=nums[i];
            }
            else{
                desired[i]=nums[i% nums.length];
            }
        }
        return desired;
    }
}
