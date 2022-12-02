package Puzzle;

import java.util.*;
public class AmstrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int orignal=n;// save it because we have to compare later
        int sum=0;// we take sum equal to zero
        while(n>0){
            int rem=n%10;// this gives us reminder
            sum=sum+(rem*rem*rem);// take the cube of digit
            n=n/10;  // this remove out number after decimal
        }
        if(orignal==sum){
            System.out.println("The given no is Armstrong Number");
        }
        else{
            System.out.println("The given no is NotArmstrong Number");
        }
    }
}
