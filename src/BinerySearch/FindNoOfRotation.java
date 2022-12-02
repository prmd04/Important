package BinerySearch;
/*We have the rotated sorted array we have to find that how many time it
rotated*/
public class FindNoOfRotation {
    public static void main(String[] args) {
        {
            int arr[]={6,7,1,2,3,4,5};
            System.out.println(noOfRotation(arr));
        }
    }

    public static int noOfRotation(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[end] >arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}