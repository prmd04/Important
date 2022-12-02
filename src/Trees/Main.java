package Trees;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        SortedArrayToBST tree=new SortedArrayToBST();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node temp=tree.sortedArraytoBst(arr);
        tree.preorder(temp);



    }
}