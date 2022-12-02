package Puzzle;
import java.util.*;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
      //  System.out.println(approch1(str,n));
        //approch2(str,n);
        approch3(str,n);

    }
    // approch 1: using new empty string and char;
    public static String approch1(String str,int n){
        String rev="";// take new empty string
        char ch; // declaration of new char
        for(int i=0;i<n;i++){
            ch=str.charAt(i);// first take the single single charecter
            rev=ch+rev;// add to the new string
        }
        return rev;
    }
    // approch 2: using character array
    public static void approch2(String str,int n){
        char []rev=str.toCharArray();
        for(int i=n-1;i>=0;i--){
            System.out.print(rev[i]);
        }
    }
    //approch 3:  char swapping 
    public static void approch3(String str,int n){
        char []rev=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char temp=rev[i];
            rev[i]=rev[j];
            rev[j]=temp;
            i++;
            j--;
        }
        for (char c:rev ){
            System.out.print(c);
        }
    }
}
