package SlidingWindow;

public class SubarrayProductLessThak {
    public static void main(String[] args) {
        int arr[]={10,5,2,6};
        int k=100;
        System.out.println(countproduct(arr,k));

    }
    public static int countproduct(int arr[],int k){
        int count=0;
        int prod=1;
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            prod*=arr[i];

            while(j<i && prod>=k){
                prod/=arr[j];
                j++;
            }
            if(prod<k){
                int len=(i-j)+1;
                count+=len;
            }
        }
        return count;
    }
}
/*
Time Complexity:O(N) where N is the size of the array A[].
Space Complexity:O(1), no extra space is used
*/