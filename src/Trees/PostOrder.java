package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrder {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //postorderRec(root);
        postorderIte(root);
    }
    public static void postorderRec(Node root){
        if(root==null){
            return;
        }
        postorderRec(root.left);
        postorderRec(root.right);
        System.out.print(root.data+" ");
    }
    public static void postorderIte(Node root){
        Stack<Node>stack=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(!stack.isEmpty() && root==stack.peek()){
                root=root.right;
            }
            else{
                list.add(root.data);
                root=null;
            }
        }
        System.out.println(list);
    }
}
