package MoreQueOnLinkedlist;
/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.*/
/*Ex.Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/
import java.util.LinkedList;

public class isHappy {
    public static void main(String[] args) {
        System.out.println(happy(19));
    }
    public static boolean happy(int n){
        int slow=n;
        int fast=n;

        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;
    }
    private static int square(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number/=10;
        }
        return ans;
    }
}

