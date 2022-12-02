package Stack;
/* find the next smaller element in the list */

import java.util.*;
public class NextSmallerElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nextSvalue(arr,n)));
    }
    public static int[] nextSvalue(int arr[],int n){
        int nsv[]=new int[n];
        Stack<Integer>st=new Stack<>();

        st.push(arr[n-1]);
        nsv[n-1]=-1;

        for(int i=n-2;i>=0;i--){

            while(st.size()>0 && arr[i]<st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nsv[i]=-1;
            }
            else{
                nsv[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nsv;

    }
}

/*
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();// size of array
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();// geeting element from the user
    int ansarr[]=new int[n];//create empty array for store the ans

    Stack<Integer>st=new Stack<>();//create the new stack
    st.push(0);// we insert the 0 value int the stack.
    for(int i=1;i<n;i++)//the for loop start form indext 1 becouse index 0 stored in stack
      {
        int curelement=arr[i];// cureent element is arr[i]
    while(!st.isEmpty() && curelement<arr[st.peek()])
      //actully st.peek means the value is in the stack curent only 0 there
      {
        ansarr[st.peek()]=curelement;//stored the value and then delete
        st.pop();
      }
        st.push(i);//if above condition is not full then add another index in stack
      }
    while(!st.isEmpty())
      {
        int index=st.peek();// no smaller element found in array
        ansarr[index]=-1;//then stored -1
        st.pop();
      }
    for(int j=0;j<n;j++)
      System.out.print(ansarr[j]+" ");

  }
}
 */
