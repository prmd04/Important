package Heaps;
import java.util.*;
public class FindKLargeElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        PriorityQueue<Integer>hp=new PriorityQueue<>();
        for(int i=0;i<n;i++) {
            if (i < k) {
                hp.add(arr[i]);
            } else {
                if (arr[i] > hp.peek()) {
                    hp.remove();
                    hp.add(arr[i]);
                }
            }
        }
            while(hp.size()!=0){
                System.out.print(hp.peek()+" ");
                hp.remove();
            }

    }
}

