package BinerySearch;

import java.util.Scanner;

public class SqrtOfno  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextInt();

        System.out.println(sqrt(x));
    }
    public static long sqrt(long x){
        if(x<=1){
            return x;
        }
        long low=1;
        long high=x;
        long ans=-1;

        while(low<=high){
            long mid=low+(high-low)/2;
            long sqrt=mid*mid;
            if(sqrt==x){
                return mid;
            }
            else if(sqrt<x){
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}
