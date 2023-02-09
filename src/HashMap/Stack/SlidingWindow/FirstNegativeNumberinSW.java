package HashMap.Stack.SlidingWindow;
import java.util.*;
public class FirstNegativeNumberinSW {
    public static void main(String[] args)
    {
        int arr[]={12,-7,-1,23,-8,1,38,42};
        int k=3;
        System.out.println(firstNegative(arr,k));
    }
    public static ArrayList<Integer> firstNegative(int arr[],int k){
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]<0){
                q.offer(arr[j]);
            }
            if((j-i)+1<k){
                j++;
            }
            else if((j-i)+1==k){
                if(q.size()>0){
                    ans.add(q.peek());
                    if(arr[i]==q.peek()){
                        q.poll();
                    }
                }
                else{
                    ans.add(0);
                }
                i++;j++;

            }

        }
        return ans;
    }
}
