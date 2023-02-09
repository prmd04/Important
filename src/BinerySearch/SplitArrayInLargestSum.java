package BinerySearch;

public class  SplitArrayInLargestSum {
    public static void main(String[] args) {
        int arr[]={7,2,5,10,8};
        int m=2;
        int ans=splitArray(arr,m);
        System.out.println(ans);

    }
    public static int splitArray(int[] arr, int m)
    {
        int max=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(arr,mid,m)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int arr[],int mid,int m){
        int sum=0;
        int pices=1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum>mid){
                pices++;
                sum=arr[i];
            }
        }
        return pices<=m;
    }
}
        
