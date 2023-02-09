package HashMap;
import java.util.*;


public class practice {
    public static void main(String[] args) {
        String s="sssssssssss";
        int sf[]=new int[26];

        for(int i=0;i<s.length();i++){
            sf[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(sf));
    }
}