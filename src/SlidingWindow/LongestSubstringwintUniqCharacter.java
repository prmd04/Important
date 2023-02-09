package SlidingWindow;
import java.util.*;
public class LongestSubstringwintUniqCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longsubstring(str));
    }


    private static int longsubstring(String str) {
        int n=str.length();
        int count = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        int j=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()<(i-j)+1){// means there are repeater
                char left=str.charAt(j);
                map.put(left,map.getOrDefault(left,0)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                j++;
            }
            if(map.size()==(i-j)+1){
                count=Math.max(count,(i-j)+1);
            }
        }
        return count;
    }
}
/*two lines are very important
1.how to chake the duplicate element is prasent
ans: map.size()<(i-j)+1;
(i-j)+1 is windows size so the character is repeated so map size still  ramain
but the windows side increase. that's all.
 */
