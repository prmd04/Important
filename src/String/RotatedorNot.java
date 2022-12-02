package String;
/*In the quetion we have two string we have to chake the second string is rotated of first one or not*/
import java.lang.*;
import java.util.*;
public class RotatedorNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str2=sc.next();
        System.out.println(isRotated(str,str2));

    }
    /*So logic of solve this program is pretty simple
    1. We have to chake first length if the length is same then possibly its rotated string
    2.the we concanated first string twice
    3. and chake the second string is substring or not */
    public static boolean isRotated(String str,String str2){
       return (str.length()== str2.length() && (str+str).contains(str2));

    }
}
