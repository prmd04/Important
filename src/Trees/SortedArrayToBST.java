package Trees;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayToBST {
    static Node sortedArraytoBst(int arr[]) {
        if(arr.length==0) {
            return null;
        }
        Node root=helper(arr,0,arr.length-1);
        return root;
    }
    private static  Node helper(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+end/2;
        Node root=new Node(arr[mid]);

        root.left=helper(arr,start,mid-1);
        root.right=helper(arr,end+1,end);

        return root;

    }
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        preorder(sortedArraytoBst(arr));

    }
}
