package BinerySearch;

import java.util.Scanner;

public class SearchInRoatetedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=ans(arr,target);
        System.out.println(ans);
    }
    public static int ans(int nums[],int target) {
        int pivot = pivotIndex(nums);
        if(pivot==-1){
            return (binarySearch(nums,0,nums.length-1,target));
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(nums[0]<=target){
            return binarySearch(nums, 0, pivotIndex(nums) - 1, target);
        }
        return binarySearch(nums, pivotIndex(nums), nums.length - 1, target);
    }
       public static int pivotIndex(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(arr[end]>arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[],int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

}

