package HashMap.Stack;
import java.util.*;
public class Histrogram {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        int n = arr.length;


        int rb[]=rightBoundari(arr);
        int lb[]=leftBoundari(arr);

        int maxarea=0;
        for(int i=0;i<n;i++){
            int widht=rb[i]-lb[i]-1;
            int area=arr[i]*widht;

            if(area>maxarea){
                maxarea=area;
            }
        }
        System.out.println(maxarea);
    }
        public static int[] rightBoundari(int arr[]){
        int n=arr.length;
        Stack<Integer> st = new Stack<>();
        int rb[]=new int[n];
        st.push(n-1);
        rb[n-1]=7;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=7;
            }
            else{
                rb[i]=st.peek();
            }
            st.push(i);
        }
        return rb;
    }
    public static int[] leftBoundari( int arr[]){
        int n= arr.length;
        Stack<Integer> st = new Stack<>();
        int lb[]=new int[n];
        st.push(0);
        lb[0]=-1;
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=st.peek();
            }
            st.push(i);
        }
        return lb;
    }
}
