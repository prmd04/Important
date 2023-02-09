package HashMap.Stack;
/* The Next Greater Element is the next greater elelmet
* ex: we have element [1,5,7,9,11,2,6,8] the ans will be
                       [5,7,9,11,-1,6,8,-1]*/


import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans[]=nextGelement(arr,n);
        for(int num : ans){
            System.out.print(num + " ");
        }
    }
    public static int[] nextGelement(int arr[],int n){
        int nge[]=new int[n];
        Stack<Integer>st=new Stack<>();

        /*First push last element in the stack
         and in ans arr becouse last value is always -1 */

        st.push(arr[n-1]);
        nge[n-1]=-1;

        /*Start loop from last-2 */
        for(int i=n-2;i>=0;i--){

            // pop until the size is zero or element is greater

            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            // if size is zero means no element is greater in case add -1
            if(st.size()==0){
                nge[i]=-1;
                // else the greater element is found then
            }else{
                nge[i]=st.peek();
            }
            st.push(arr[i]); // push itself
        }
        return nge;
    }
}

