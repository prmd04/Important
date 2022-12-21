package BinerySearch;
/*Q: find first and last ocuureance of index*/
public class FindfirstandLastOcc {
    public static void main(String[] args) {
        int arr[]={3,5,7,7,7,7,7,9,11,13};
        int target=7;
        System.out.println(firstocurrence(arr,target));
        System.out.println(findSecondOccarance(arr,target));
        System.out.println("adepramod");
    }

    public static int firstocurrence(int arr[],int target){
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((mid==0 || arr[mid-1]<target) && arr[mid]==target)
                return mid;

            else if(target>arr[mid])
                low=low+1;

            else
                high=mid-1;

        }
        return -1;
    }
    public static int findSecondOccarance(int arr[],int target){
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((mid==0|| arr[mid+1]>target) && arr[mid]==target)
                return mid;

            else if(target < arr[mid])
                high=mid-1;

            else
                low=mid+1;
        }
        return -1;
    }
}