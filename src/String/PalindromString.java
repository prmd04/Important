package String;

import java.util.Scanner;

/*Palindrom means magun samorun sarkh ch pahije */
public class PalindromString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("The given string is palindrome?");
        System.out.println(method1(str));
        System.out.println(method2(str));
        System.out.println(method3(str));

    }

    // following method is using while loop to find out palindrome string
    public static boolean method1(String str) {
        char ch[] = str.toCharArray();// take a char arr and put string in it
        int i = 0;// taking variable i=0;
        int j = str.length() - 1;// take variable j=1;
        while (i <= j) {// loop will run until the  i becoming the greater than j;
            if (ch[i] == ch[j]) {// chake the first position char  is equal to last position char
                i++;// if yes then incriment i two go next position
                j--;// and the j is decrement to go another char
            } else {// if any char is not equal then the string is not polindrom;
                return false;
            }
        }
        return true;
    }

    // following method is use array till half travelling
    public static boolean method2(String str) {
        char ch[] = str.toCharArray();// take a char arr and put string in it
        int count = 0;// take count 0;
        for (int i = 0; i <= ch.length / 2; i++) {// take a array until half of the array
            if (ch[i] != ch[ch.length - 1 - i]) {// if first element is not equal to last and then increment decrement
                return false;// then return false
            }
        }
        return true;// otherwise its true'
    }

    // The third method is reverse the string and chake the reverse string and given string are similar or not
    // if both are similar them the string is pallindome
    public static boolean method3(String str) {
        String rev="";// declare a new empty string to store valued
        char ch;// character is use for hold the character
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;// whatever character is in ch hold the first place
        }
        return str.equals(rev);// remember use equals always not == operator;
    }
}