package BinerySearch;
/*Biotionic array means accending till one point and then desending
 just like mountains.
Q:find the peak of mountain?
we have given height of mountain we have to return peak height of mountain
*/
public class BiotnicArrayPeakElement {
    public static void main(String args[]){
        int arr[]={5,1,2,3,4};
        System.out.println(peakIndexInMountainArray(arr));

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(low==high){
                return mid;
            }
            else if(arr[mid+1]>arr[mid]){
                low=mid+1;
            }
            else {
                high=mid;
            }
        }
        return -1;
    }
}
