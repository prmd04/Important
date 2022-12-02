package ModuleDQuetion.Nov16;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxProductofThreeElement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProduct(arr,n));
    }
    public static int maxProduct(int arr[],int n){
        if(arr.length<=2) return 0;
        Arrays.sort(arr);
        int maxproduct=arr[0]*arr[1]*arr[n-1];
        int maxproduct1=arr[n-1]*arr[n-2]*arr[n-3];
        return Math.max(maxproduct,maxproduct1);
    }
}
