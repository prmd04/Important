package SlidingWindow;

import java.util.Scanner;

public class Countsubarrayofsizekwhichstriclyinincreasingorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countsub(arr,k,n));
    }
    public static int countsub(int arr[],int k,int n){
        int count=0;
        int i=0;
        while(i<n){
            int j=i+1;
            while(j<n && arr[j]>=arr[j-1]){
                j++;
            }
            count+=Math.max(j-i-k+1,0);
            i=j;
        }
        return count;
    }
}
