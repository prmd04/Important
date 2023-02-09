package HashMap.Stack.SlidingWindow;
import java.util.*;
public class PairSumDivisiblebyK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(pairsum(arr,k));
    }
    public static int pairsum(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            while(j<arr.length){
                if((arr[i]+arr[j])%k==0){
                    count++;
                    j++;
                }
                else
                    j++;
            }
        }
        return count;
        }
    }