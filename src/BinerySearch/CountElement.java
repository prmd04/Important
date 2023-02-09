package BinerySearch;

import java.util.Scanner;

public class CountElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int first=firstPosition(arr,n,target);
        int second=secondPosition(arr,n,target);
        if(first!=-1 && second!=-1){
            System.out.println(second-first+1);
        }
        else{
            System.out.println("No element found");
        }
    }
    public static int firstPosition(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        int first=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int secondPosition(int arr[],int n,int target){
        int low=0;
        int high=n-1;
        int second=-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                second=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return second;
    }
}
