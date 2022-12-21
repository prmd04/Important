package HashMap;
import java.util.*;
public class FindaAllanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String p = sc.next();


        ArrayList<Integer> ans = anagram(s, p);
        for (int h : ans) {
            System.out.print(h + " ");
        }
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
}
