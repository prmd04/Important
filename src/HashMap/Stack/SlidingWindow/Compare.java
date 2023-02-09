package HashMap.Stack.SlidingWindow;

import java.util.HashMap;

public class Compare {
    public static void main(String[] args) {
        String p="pramodanilade";
        String s="adepramodanilk";
        HashMap<Character,Integer>pmap=new HashMap<>();
        HashMap<Character,Integer>smap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);

        }
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);

        }
        for(char ch:smap.keySet()){
            if(smap.get(ch)!=pmap.getOrDefault(ch,0)){
                System.out.println("false");
                break;
            }

        }
        System.out.println("True");
    }
}
