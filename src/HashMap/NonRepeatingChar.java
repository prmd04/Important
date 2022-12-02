package HashMap;
import java.util.*;
public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                int oldf = hm.get(ch);
                int newf = oldf + 1;
                hm.put(ch, newf);
            } else {
                hm.put(ch, 1);
            }
        }
        Boolean val = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.get(ch) == 1) {
                System.out.println(ch);
                val = true;
                break;
            }

        }
        if (!val) {
            System.out.println("-1");
        }
    }

    }
