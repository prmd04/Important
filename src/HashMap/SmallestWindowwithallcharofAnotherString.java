package HashMap;
import java.util.*;
public class SmallestWindowwithallcharofAnotherString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String source=sc.next();
        String pattern=sc.next();
        String newa=smallWindow(pattern,source);
        System.out.println(newa);

    }
    public static String smallWindow(String pat,String sou){
        String ans="";
        int patl=pat.length();

        HashMap<Character,Integer>mapp=new HashMap<>();
        for(int i=0;i<patl;i++){
            char ch=pat.charAt(i);
            mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        }
        int mcnt=0;
        int dmcnt=patl;

        HashMap<Character,Integer>maps=new HashMap<>();
        int i=-1;
        int j=-1;
        while(true) {
            boolean flag1=false;
            boolean flag2=false;
            //acquire
            //acquire till the match count less desire match count
            while (i < sou.length() - 1 && dmcnt > mcnt) {
                i++;
                char ch = sou.charAt(i);
                maps.put(ch, maps.getOrDefault(ch, 0) + 1);

                if (mapp.containsKey(ch)) {
                    if(mapp.get(ch)>=maps.get(ch)){
                        mcnt++;
                    }
                }
                flag1=true;
            }
            //release and collect ans
            while (j < i && mcnt == dmcnt) {// release till the count is equall to dcount
                // collect ans
                String pans = sou.substring(j + 1, i + 1);
                if (ans.length() == 0 || pans.length() < ans.length()) {
                    ans = pans;
                }
                j++;
                char ch=sou.charAt(j);
                if(maps.get(ch)==1){
                    maps.remove(ch);
                }
                else{
                    maps.put(ch,maps.get(ch)-1);
                }
                if(mapp.containsKey(ch)){
                    if(mapp.get(ch)>maps.getOrDefault(ch,0)){
                        mcnt--;

                    }
                }
                flag2=true;
            }
            if(flag1==false && flag2==false){
                break;
            }
        }



        return ans;
    }
}
