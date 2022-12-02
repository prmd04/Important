package Stack;
import java.util.*;
public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
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

}
