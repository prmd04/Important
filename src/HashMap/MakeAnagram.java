package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        //System.out.println(remAnagrams(s1,s2));

    }
    public static void remAnagrams(String s,String s1)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }


    }

}
