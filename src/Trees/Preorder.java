package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class Preorder {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        preorderIte(root);
    }
    public static void preorderRec(Node root){
        if(root==null) return;

        System.out.print(root.data+" ");
        preorderRec(root.left);
        preorderRec(root.right);
    }
    public static void preorderIte(Node root){
        Stack<Node>stack=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        while(root!=null || !stack.isEmpty()){
            list.add(root.data);
            if(root.right!=null){
                stack.push(root.right);
            }
            root=root.left;
            if(root==null && !stack.isEmpty()){
                root=stack.pop();
            }
        }
        System.out.println(list);
    }
}
