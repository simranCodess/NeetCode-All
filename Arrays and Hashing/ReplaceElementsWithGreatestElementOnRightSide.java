

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int [] desired= new int [arr.length];
        desired[arr.length-1]=-1;
        int lastValue=arr[arr.length-1];
        for(int i= arr.length-2; i>=0; i--){
            int maxElement=Math.max(arr[i+1],desired[i+1]);
            //System.out.println(maxElement);
            desired[i]=maxElement;
        }
        return desired;
    }
}
