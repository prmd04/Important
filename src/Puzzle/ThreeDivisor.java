package Puzzle;
import java.util.*;
public class ThreeDivisor {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int query[] = new int[q];
        for(int i=0;i<q;i++)
            query[i]=sc.nextInt();

    }
    public static ArrayList<Integer> Divisor(int arr[],int n){
        ArrayList<Integer> list=new ArrayList<>();
        int k=0;
        while(n>arr.length){
            if(arr[k]>1 || arr[k]>2) {
                list.add(0);
                break;
            }

        }
        return list;
    }
}
