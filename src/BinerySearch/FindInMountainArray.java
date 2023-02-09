package BinerySearch;
/* Q:Find In the Mountain Array
    Given a mountain array mountainArr,
    return the minimum index such that mountainArr.get(index) == target.
    If such an index does not exist, return -1.

    Ex:Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5.
Return the minimum index, which is 2.Input:
array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5.
Return the minimum index, which is 2.
 */
public class FindInMountainArray {
    public static void main(String[] args) {
        int arr[]={0,1,2,4,2,1};
        int target=4;
        int firstindex=indexOfElement(arr,0,peakIndex(arr),target);
        if(firstindex!=-1){
            System.out.println(firstindex);
        }
        else {
            int secondindex = indexOfElement(arr, peakIndex(arr)+1, arr.length - 1, target);
            System.out.println(secondindex);
        }
    }
    public static int peakIndex( int arr[]) {
        int low=0,high=arr.length-1;
        int mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if(low==high){
                return mid;
            }
            else if(arr[mid+1]>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return -1;
    }
    public static int indexOfElement(int arr[],int low,int high,int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){

                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

}
