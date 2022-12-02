package ModuleDQuetion;

public class MaxSubArr {
    public static void main(String[] args) {
         int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubarr(arr));
    }

    private static int maxsubarr(int[] arr) {
        int maxsum=0;
        int cursum=0;
        for(int i=0;i<arr.length;i++){
            cursum+=arr[i];
            if(maxsum<cursum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}
