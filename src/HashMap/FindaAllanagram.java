package HashMap;
import java.util.*;
public class FindaAllanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lens = sc.nextInt();
        String s = sc.next();
        int lenp = sc.nextInt();
        String p = sc.next();
        ArrayList<Integer>ans=anagram(s,p,lens,lenp);
        for(int h:ans){
            System.out.print(h+" ");
        }
    }

    static ArrayList<Integer> anagram(String s, String p,int lens,int lenp) {
        ArrayList<Integer> list = new ArrayList<>();

        char sfreq[] = new char[26];
        char pfreq[] = new char[26];

        for (int i = 0; i < lenp; i++) {
            pfreq[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < lenp; i++) {
            sfreq[s.charAt(i) - 'a']++;
        }
        for (int i = lenp; i < lens; i++) {
            if (Arrays.equals(pfreq, sfreq)) {
                list.add(i - lenp);
            }
            sfreq[s.charAt(i) - 'a']++;
            sfreq[s.charAt(i - lenp) - 'a']--;
        }
        if (Arrays.equals(pfreq, sfreq)) {
            list.add(lens - lenp);
        }
        return list;
    }
}