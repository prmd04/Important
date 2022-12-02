package Stack;
import java.util.*;
public class Infix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Integer> number = new Stack<>();
        Stack<Character> symbol = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                symbol.push(ch);
            } else if (Character.isDigit(ch)) {
                number.push(ch - '0');
            } else if (ch == ')') {
                while (symbol.peek() != '(') {
                    char sym = symbol.pop();
                    int v2 = number.pop();
                    int v1 = number.pop();

                    int val = operation(v1, v2, sym);
                    number.push(val);
                }
                symbol.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (symbol.size() > 0 && symbol.peek() != '(' &&
                        priority(ch) <= priority(symbol.peek())) {
                    char sym = symbol.pop();
                    int v2 = number.pop();
                    int v1 = number.pop();

                    int val = operation(v1, v2, sym);
                    number.push(val);
                }
                symbol.push(ch);
            }
        }
        while (symbol.size() != 0) {
            char sym = symbol.pop();
            int v2 = number.pop();
            int v1 = number.pop();

            int val = operation(v1, v2, sym);
            number.push(val);
        }
        System.out.println(number.peek());
    }

    public static int priority(char sign){
        if(sign=='+'){
            return 1;
        }
        else if(sign == '-'){
            return 1;
        }
        else if(sign == '*'){
            return 2;
        }else
            return 2;
    }
    public static int operation(int v1,int v2,char sign){
        if(sign=='+'){
            return v1+v2;
        }
        else if(sign == '-'){
            return v1-v2;
        }
        else if(sign == '*'){
            return v1*v2;
        }else
            return v1/v2;
    }
}

