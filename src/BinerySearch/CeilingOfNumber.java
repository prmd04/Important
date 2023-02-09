package BinerySearch;


/* Q:What is ceiling of number
ans: least integer number greater than or equal to the given number.
ex:{2,3,5,9,14,16,18} this is array and target is 15 the ans is 16 */


public class CeilingOfNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=4;
        int start=0;
        int end=arr.length-1;
        System.out.println(ceiling(arr,start,end,target));
    }
    public static int ceiling(int arr[],int s,int e,int x){

//        if(s>e) {        // if the number not found then s = the next value
//            return s;    // so return s;
//        }
//
//
//
//
//        if(arr[mid]==x){
//            return mid;
//        }
//        if(arr[mid]>x){
//            return ceiling(arr,s,mid-1,x);
//        }
//        else
//            return ceiling(arr,mid+1,e,x);
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                return arr[mid];
            }
            else if(arr[mid]>x){
                ans=arr[mid];
                e=mid-1;
            }
            else
                s=mid+1;
        }
        return ans;

    }
}
