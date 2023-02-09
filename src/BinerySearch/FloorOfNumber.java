package BinerySearch;
/*Q.find the floor No in in array
  floor means " Greatest number which smaller than or equal to target*/
public class FloorOfNumber {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=10;
        System.out.println(floor(arr,0,arr.length-1,target));
    }
    public static int floor(int arr[],int low,int high,int x)
    {
        int floor=0;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;

            if(arr[mid]==x)
            {
                return arr[mid];
            }
            else if(arr[mid]<x)
            {
                floor=arr[mid];
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return floor;

    }
}
