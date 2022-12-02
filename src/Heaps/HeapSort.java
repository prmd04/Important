package Heaps;
import java.util.*;
public class HeapSort {
    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
        int rank[]={22,3,99,32,46,36,89,1,12};
        PriorityQueue<Integer>hp=new PriorityQueue<>(Collections.reverseOrder());
        for(int val:rank){
            hp.add(val);
        }
        while(hp.size()>0){
            System.out.print(hp.peek()+" ");
            hp.remove(hp.peek());
        }
    }
}
