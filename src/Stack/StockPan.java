package Stack;
/*if stock is [100 80 60 70 60 75 85]
              [1    1   1  2 1   4 6]
 left greater value in simple term and there difference
 100 left greater value is not prasent so = 1
  80 left greater value is 100 the difference is = 1
   60 left greater value is 100 the difference is = 1
    70 left greater value is 80 the difference is = 2
     60 left greater value is 70 the difference is = 1
      75 left greater value is 80 the difference is = 4
       85 left greater value is 100 the difference is = 6

       difference = element index-previous greater index
   */

import java.util.*;
public class StockPan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(previousGreaterValue(arr,n)));
    }
    public static int[] previousGreaterValue(int arr[],int n){
        int pgv[]=new int[n];
        Stack<Integer>st=new Stack<>();

        // push first index in stack
        // add first value is 1 becouse it has no previous greater

        st.push(0);
        pgv[0]=1;

        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                pgv[i]=i+st.peek();
            }
            else{
                pgv[i]=i-st.peek();
            }
            st.push(i);
        }
        return pgv;

    }
}
