package HashMap.Stack;
import java.util.*;
public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPar(str));
    }
    public static void balBrack(String str){

        Stack<Character>st=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else if(ch==')') {
                boolean val=helper(st,'(');
                if(!val) {
                    System.out.println("NO");
                    return;
                }
            }
            else if(ch==']'){
                boolean val=helper(st,'[');
                if(!val) {
                    System.out.println("NO");
                    return;
                }
            }
            else if(ch=='}'){
                boolean val=helper(st,'{');
                if(!val) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(st.size()==0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");

    }
    public static boolean helper(Stack<Character>st,char c){
        if(st.size()==0){
            return false;
        }
        else if(st.peek()!=c){
            return false;
        }
        else {
            st.pop();
            return true;
        }
    }
    static boolean isPar(String str){
        Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){ // in this case we have one extra
                    return false;// opening bracket
                }
                char chc=st.peek();
                if(ch==')'&& chc=='('){
                    st.pop();
                }
                else if(ch==']' && chc=='['){
                    st.pop();
                }
                else if(ch=='}' && chc=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

}
