package BinerySearch;

import java.util.Scanner;

public class Order_agnostic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(bsearch(arr,n,target));

    }
    public static int bsearch(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[low]<arr[high] && target>arr[mid] ||
                    arr[low]>arr[high] && target<arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
