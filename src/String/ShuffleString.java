package String;
import java.lang.*;
import java.util.*;
/*You are given a string s and an integer array indices of the same length. The string s will be shuffled
such that the character at the ith position moves to indices[i] in the shuffled string.
Ex.
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.*/
public class ShuffleString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("Give the size of array");
        int n=sc.nextInt();
        int indices[]=new int[n];
        for(int i=0;i<n;i++)
            indices[i]=sc.nextInt();
        System.out.println(shuffle(str,indices));
    }
    public static String shuffle(String str,int arr[]){

        char ch[]=str.toCharArray();   // str convert into char array;
        for(int i=0;i<arr.length;i++){
            ch[arr[i]]=str.charAt(i);// replace the charecter with index to charAt
        }
        return String.valueOf(ch);
    }

}
