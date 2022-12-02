package Puzzle;
import java.util.*;
public class PositionOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(large(arr,n));
    }
    public static int large(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                if(arr[j]*2<=arr[i]){
                    count++;
                }
            }
            if(count==n-1){
                return i;
            }
            count=0;
        }
        return-1;
    }
}
