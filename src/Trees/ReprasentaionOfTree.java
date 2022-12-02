package Trees;
import java.util.*;
public class ReprasentaionOfTree {
    public static void main(String[] args) { 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Preorder with Recursion");
        preorder(root);
        System.out.println("\nPreorder with Iterative");
        System.out.println(preorderI(root));
        System.out.println("\nInnorder with Recursion");
        innorder(root);
        System.out.println("\nInnorder with Iterative");
        System.out.println(innorderI(root));
        System.out.println();
        System.out.println("\nPostorder with recursion");
        postorder(root);
        System.out.println("\nPostorder with Iterative");
        System.out.println( postorderI(root));


    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void innorder(Node root) {
        if (root == null) {
            return;
        }
        innorder(root.left);
        System.out.print(root.data + " ");
        innorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static ArrayList<Integer> preorderI(Node root){
        Stack<Node>st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        Node curr=root;
        while(curr!=null){
            ans.add(curr.data);
            if(curr.right!=null){
                st.push(curr.right);
            }
            curr=curr.left;
            if(curr==null && st.size()>0){
                curr=st.pop();
            }
        }
        return ans;
    }
    public static ArrayList<Integer> postorderI(Node root){
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        while(root!=null || !st.empty()){
            while(root!=null){
                st.push(root);
                st.push(root);
                root=root.left;
            }

            root=st.pop();
            if(!st.empty() && st.peek()==root){
                root=root.right;
            }
            else{
                ans.add(root.data);
                root=null;
            }

        }
        return ans;

    }
    public static ArrayList<Integer> innorderI(Node root){
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        while(root!=null || !st.empty()){
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else
            {
                root=st.pop();
                ans.add(root.data);
                root=root.right;
            }
        }
        return ans;
    }

}

class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
    this.data=val;
    this.left=null;
    this.right=null;
    }


}

