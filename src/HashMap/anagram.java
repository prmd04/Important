package HashMap;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(anagram(s,t));
    }
    static Boolean anagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)==0)
            {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
