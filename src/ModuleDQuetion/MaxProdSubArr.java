package ModuleDQuetion;

public class MaxProdSubArr {
    public static void main(String[] args) {
        int arr[]={-2,0,-1};
        System.out.println(solution(arr));
    }
    public static int solution(int arr[]){
        int maxProduct=Integer.MIN_VALUE;
        int curProduct=1;
        for(int i=0;i<arr.length;i++){
            curProduct*=arr[i];
            if(maxProduct<curProduct){
                maxProduct=curProduct;
            }
            if(curProduct<0){
                curProduct=1;
            }
        }
        return maxProduct;
    }
}
