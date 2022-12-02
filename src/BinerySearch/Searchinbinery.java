package BinerySearch;

public class Searchinbinery {
    public static void main(String[] args) {
        int arr[]={1,2,4,8,10,15,21};
        int target=3;
        int start=0;
        int end=arr.length-1;
        System.out.println(binearySearch(arr,start,end,target));
    }
    public static int binearySearch(int arr[],int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binearySearch(arr,s,mid-1,target);
        }
        else {
            return binearySearch(arr,mid+1,e,target);
        }
    }
}
