package BinerySearch;
import java.util.*;
import java.lang.*;
import java.io.*;
public class TringularNumber {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            if(sum==n){
                System.out.println(1);
                break;
            }
            else if(sum>n){
                System.out.println(0);
                break;
            }
        }

    }
}