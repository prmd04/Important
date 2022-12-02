package String;
import java.lang.*;
import java.util.*;
/*The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted
into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that
each substring contains exactly one unique digit. Then for each substring, say the number of digits,
then say the digit. Finally, concatenate every said digit.

For example, the saying and conversion for digit string "3322251":
ex.Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
*/
public class CountandSay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countsay(n));
    }
    public static String countsay(int n){
        if (n==1)
            return "1";
       String s= countsay(n-1);   // here we use recursion becouse whatever n is the behind all cased recursion
        // get for us
       StringBuilder t=new StringBuilder();// we have stored the num and count so decalred stringbuilder
       int count=1,i=1,num=s.charAt(0)-'0';// fix count =1 becouse no atlist one time occure
        // i=1 becouse we start chaking from no 2;
        //and nums equal to we want int not char that why -'0'
       while(i<s.length()){ // untill the i is greater than the s length
           if(num==s.charAt(i)-'0'){// if this condition is true the count increse by one
               count++;
           }
           else{
               t.append(count).append(num);// add the num and count
               num=s.charAt(i)-'0';// set new value for num
               count=1;// count set to be at zero
           }
           i++;// have to increase the i in any case
       }
       t.append(count).append(num);// this is for last num and count
       return String.valueOf(t); //return string

    }

}
