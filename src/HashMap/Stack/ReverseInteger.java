package HashMap.Stack;
import java.util.*;
public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        Stack<Integer>st=new Stack<>();

        while(number>0){
            st.push(number%10);
            number=number/10;
        }
        int reverse=0;
        int i=1;
        while(st.size()!=0){
            reverse=reverse+st.peek()*i;
            i=i*10;
            st.pop();
        }
        if(reverse> Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
            System.out.println("0");
        }
        System.out.println(reverse);
    }
}
