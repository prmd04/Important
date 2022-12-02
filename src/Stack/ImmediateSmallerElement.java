package Stack;

import java.util.Scanner;
import java.util.Stack;

/*We want next smaller immediate element
 its little different that next smaller element */
public class ImmediateSmallerElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=immediatesmall(arr,n);
        for(int a:ans){
            System.out.print(a+" ");
        }
    }
    public static int[] immediatesmall(int arr[],int n){
        int ise[]=new int[n];
        Stack<Integer>st=new Stack<>();

        st.push(arr[n-1]);
        ise[n-1]=-1;

        for(int i=n-2;i>=0;i--){
            if(st.peek()<arr[i]){
                ise[i]=st.peek();
            }
            else {
                ise[i]=-1;
            }
            st.push(arr[i]);
        }
        return ise;

    }
}
