package Stack;
import java.util.*;
public class InfixToPrefix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        Stack<String>prefix=new Stack<>();
        Stack<Character>symbol=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='('){
                symbol.push(ch);
            }
            else if(ch >='0' && ch <='9' ||
                    ch >='a' && ch <='z' ||
                    ch >='A' && ch <= 'Z')
            {
                prefix.push(ch +"");
            }
            else if(ch == ')')
            {
                while(symbol.peek()!='(')
                {
                    char opr=symbol.pop();
                    String v2=prefix.pop();
                    String v1=prefix.pop();

                    String lstr=opr+v1+v2;
                    prefix.push(lstr);

                }
                symbol.pop();
            }
            else if(ch == '+' || ch=='-' || ch=='*' || ch=='/'){
                while (symbol.size() > 0 && symbol.peek() != '(' &&
                        priority(ch) <= priority(symbol.peek())){
                    char opr=symbol.pop();
                    String v2=prefix.pop();
                    String v1=prefix.pop();

                    String lstr=opr+v1+v2;
                    prefix.push(lstr);
                }
                if(symbol.size()>0)
                symbol.push(ch);
            }

        }
        while(symbol.size()!=0)
        {
            char opr=symbol.pop();
            String v2=prefix.pop();
            String v1=prefix.pop();

            String lstr=opr+v1+v2;
            prefix.push(lstr);

        }
        System.out.println(prefix.peek());
    }
    public static int priority(char symbol){
       if(symbol == '+'){
           return 1;
       }
       else if(symbol=='-'){
           return 1;
       }
       else if(symbol == '*')
       {
           return 2;
       }
       else
           return 2;
    }
}
