package String;
import java.util.*;
import java.lang.*;
/*Find duplicate is so simple you have just converted into character array*/
public class FindDublicate {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();// taking input from the user
    char ch[]=str.toCharArray();// converted into charcter array
    for(int i=0;i<str.length();i++){
        for(int j=i+1;j<str.length();j++){
            if(ch[i]==ch[j]){                    // this are the camparision only
                System.out.print(ch[j]+" ");
                break;
            }
        }
    }
    }
}
