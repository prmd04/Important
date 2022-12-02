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
        int ls=s.length();
        int lt=t.length();
        if(ls!=lt)return false;
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<ls;i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(int i=0;i<lt;i++){
            char ch=t.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    hm.remove(ch);
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
