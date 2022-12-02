package BinerySearch;
/*Q.find the floor No in in array
  floor means " Greatest number which smaller than or equal to target*/
public class FloorOfNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=1;
        System.out.println(floor(arr,0,arr.length-1,target));
    }
    public static int floor(int arr[],int s,int e,int x){

        int mid=s+(e-s)/2;
        if(s>e)return e;

        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            return floor(arr,s,mid-1,x);
        }
        else {
            return floor(arr, mid + 1, e, x);
        }
    }
}
