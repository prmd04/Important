package String;
/*Here the String reverese program there is some method which used to reverese string */
import com.sun.security.jgss.GSSUtil;

import java.lang.*;
public class ReverseString {
    public static void main(String args[]){
    String name="abcde";
        System.out.println(usingAnotherString(name));
        System.out.println(usingstringbuilder(name));
        usingchararr(name);
        usingchararr2(name);
}
/*using another string*/
public static String usingAnotherString(String name){
    String rev="";// declare a new empty string to store valued
    char ch;// character is use for hold the character
    for(int i=0;i<name.length();i++){
        ch=name.charAt(i);
        rev=ch+rev;// whatever character is in ch hold the first place
    }
    return rev;
}
public static StringBuilder usingstringbuilder(String name){
    StringBuilder newstr=new StringBuilder();// define a StringBuilder
    newstr.append(name);//here we append the whole string in stringBuilder
    newstr.reverse();//reverse the stringbuilder
    return newstr;// return the stringbuilder
}
public static void usingchararr(String name){
    char[] tempo=name.toCharArray();//take a char array and put the string in it
    int left=0;// take variable which start from left means from 0
    int right=name.length()-1;// take variable right which start from last
    while(left<right){// until right is greater than the left
        char temp=tempo[left];
        tempo[left]=tempo[right];// swap variable and increse left and decrease right
        tempo[right]=temp;
        left++;
        right--;
    }
    for(char c:tempo)
        System.out.print(c);
    System.out.println();
}
public static void usingchararr2(String name){
    char temp[]=name.toCharArray();//Taking a char Array in take string in it
    for(int i=name.length()-1;i>=0;i--){// start loop from last
        System.out.print(temp[i]);//print the element
    }
}
}