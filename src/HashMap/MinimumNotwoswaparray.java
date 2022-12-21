package HashMap;
import java.util.*;
public class MinimumNotwoswaparray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(minimumswap(arr));
    }
    public static int minimumswap(int arr[]){
        /* to find the correct position of the element we need sorted array
        that's why we create one temp array and copy all element of the original
        array. and then we sort the temp array this way we find out the exact
        position of the element and then we put into the map;
         */
        int temp[]=Arrays.copyOf(arr,arr.length);
        int count=0;

        Arrays.sort(temp);
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<temp.length;i++){// here we put all element in the map
            //with correct position
            map.put(temp[i],i);
        }

        for(int i=0;i<arr.length;i++){
            while(map.get(arr[i])!=i){ // if the current position not match to the
                count++;            // exact position then we swapped
                swap(arr,map.get(arr[i]),i);
            }
        }
        return count;


    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
