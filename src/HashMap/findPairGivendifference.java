package HashMap;
import java.util.*;
public class findPairGivendifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(difference(arr,target));
    }
    public static int difference(int arr[],int target){
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i<arr.length && j<arr.length){
            if(arr[j]-arr[i]==target){
                return 1;
            }
            else if(arr[j]-arr[i]<target){
                j++;
            }
            else
                i++;
        }
        return 0;
    }
}
