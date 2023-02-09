package HashMap.Stack;
import java.util.*;
public class DuplicateBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(duplicate(str));
    }
    public static Boolean duplicate(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    return true;
                }
                while (st.peek() != '(') {
                    st.pop();
                }
                st.pop();

            } else {
                st.push(ch);
            }
        }
        return false;
    }
}
