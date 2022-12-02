package Trees;

import java.util.ArrayList;
import java.util.Stack;

public class Innorder {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        //innorder(root);

        innorderIt(root);

    }
    public static void innorder(Node root){
        if(root==null) return;

        innorder(root.left);
        System.out.print(root.data+" ");
        innorder(root.right);
    }
    public static void innorderIt(Node root){
        Stack<Node>stack=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        while(root!=null || !stack.isEmpty()){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }
            else{
                root= stack.pop();
                ans.add(root.data);
                root=root.right;
                }

            }
        System.out.println(ans);
        }

    }
