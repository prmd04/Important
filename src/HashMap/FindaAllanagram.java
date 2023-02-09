package HashMap;
import java.util.*;
public class FindaAllanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String p = sc.next();


        int ans = newp(s,p);
        System.out.println(ans);
        //for (int h : ans) {
        //    System.out.print(h + " ");
        //}
    }

    public static ArrayList<Integer> anagram(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> maps = new HashMap<>();
        HashMap<Character, Integer> mapp = new HashMap<>();
        int lenp = p.length();

        for (int i = 0; i < lenp; i++) {
            if (mapp.containsKey(p.charAt(i))) {
                mapp.put(p.charAt(i), mapp.get(p.charAt(i)) + 1);
            } else {
                mapp.put(p.charAt(i), 1);
            }
        }


        for (int i = 0; i < lenp; i++) {
            if (maps.containsKey(s.charAt(i))) {
                maps.put(s.charAt(i), maps.get(s.charAt(i)) + 1);
            } else {
                maps.put(s.charAt(i), 1);
            }
        }

        int i = p.length();
        int j = 0;
        while (i < s.length()) {
            if (mapp.equals(maps)) {
                list.add(j);
            }

            //aquire
            if (maps.containsKey(s.charAt(i))) {
                maps.put(s.charAt(i), maps.get(s.charAt(i)) + 1);
            } else {
                maps.put(s.charAt(i), 1);
            }
            //release
            char chr = s.charAt(i - p.length());
            if (maps.containsKey(chr)) {
                if (maps.get(chr) == 1) {
                    maps.remove(chr);
                } else {
                    maps.put(chr, maps.get(chr) - 1);
                }
            }
            i++;
            j++;


        }
        if (mapp.equals(maps)) {
            list.add(j);
        }
        return list;

    }
    public static int findAnagrams(String txt, String pat) {
        int count=0;
        int lenp=pat.length();
        int lens=txt.length();
        if(lenp>lens)
            return count;
        //ArrayList<Integer> list = new ArrayList<>();

        char sfreq[] = new char[26];
        char pfreq[] = new char[26];

        for (int i = 0; i < lenp; i++) {
            pfreq[pat.charAt(i) - 'a']++;
        }
        for (int i = 0; i < lenp; i++) {
            sfreq[txt.charAt(i) - 'a']++;
        }
        for (int i = lenp; i < lens; i++) {
            if (Arrays.equals(pfreq, sfreq)) {
                count++;
            }
            sfreq[txt.charAt(i) - 'a']++;
            sfreq[txt.charAt(i - lenp) - 'a']--;
        }
        if (Arrays.equals(pfreq, sfreq)) {
            count++;
        }
        return count;
    }
    public static int newp(String txt,String pat ) {
        int count = 0;
        if (pat.length() > txt.length()) {
            return count;
        }
        HashMap<Character, Integer> mapp = new HashMap<>();
        HashMap<Character, Integer> mapt = new HashMap<>();
        int n = pat.length();
        for (int i = 0; i < n; i++) {
            char ch = pat.charAt(i);
            mapp.put(ch, mapp.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char ch = txt.charAt(i);
            mapt.put(ch, mapt.getOrDefault(ch, 0) + 1);
        }
        for (int i = n; i < txt.length(); i++) {
            if (mapp.equals(mapt)) {
                count++;
            }
            //aquire
            char cha = txt.charAt(i);
            mapt.put(cha, mapt.getOrDefault(cha, 0) + 1);

            //release
            char chr = txt.charAt(i - n);
            mapt.put(chr, mapt.getOrDefault(cha, 0) - 1);
            if (mapt.get(chr) == 0) {
                mapt.remove(chr);
            }
        }
        if (mapp.equals(mapt)) {
            count++;
        }

        return count;
    }
}
