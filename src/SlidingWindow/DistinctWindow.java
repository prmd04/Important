/*You are given a string Str
   Your task is to find the smallest window of string
    with all distinct characters of the given string.*/
package SlidingWindow;
import java.util.*;
public class DistinctWindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(distinctwindow(str));
    }

    private static String distinctwindow(String str) {
        String ans="";
        HashMap<Character,Integer>map=new HashMap<>();
        int j=0;// tracking first index
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while( map.size()<(i-j)+1){
                map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)-1);
                if(map.get(str.charAt(j))==0){
                    map.remove(str.charAt(j));
                }
                j++;
            }
            if(map.size()==(i-j)+1){
                if(ans.length()==0 || ans.length()-1<map.size()){
                    ans=str.substring(j,i+1);
                }
            }

        }
        return ans;


    }
}
