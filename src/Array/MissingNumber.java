package Array;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int n=arr.length;

        int l=arr[n-1];
        int total_sum=(l*(l+1)/2);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        System.out.println(total_sum-sum);
    }
}
