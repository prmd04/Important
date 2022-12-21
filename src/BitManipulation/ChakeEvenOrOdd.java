package BitManipulation;

import java.util.Scanner;

public class ChakeEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if((n & 1) == 0){
            System.out.printf("the given number %d is even number",n);
        }
        else
            System.out.printf("the given number %d is odd number", n);
    }
}
// Explanation
/* Actually it take binary number of n and one into it.
   then perform and operation. so basically and operation do all zero or can only
   one 1;

   ex;
   byte n=20;
   binary 0f 20 is=00010100 & 00000001=00000000;
 */