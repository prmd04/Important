package Trees;

import java.util.*;
class Pair{
    Node node;
    int num;

    Pair(Node node,int val){
        this.node=node;
        this.num=val;
    }
}
public class PreInPostinOne {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        preInPos(root);
    }
    public static void preInPos(Node root){
        Stack<Pair>st=new Stack<Pair>();
        ArrayList<Integer>pre=new ArrayList<>();
        ArrayList<Integer>in=new ArrayList<>();
        ArrayList<Integer>post=new ArrayList<>();
        if(root==null){
            return;
        }
        st.push(new Pair(root,1));
        while(!st.empty()){
            Pair it=st.pop();

            if(it.num==1){
                pre.add(it.node.data);
                it.num++;
                st.push(it);

                if(it.node.left!=null){
                    st.push(new Pair(it.node.left,1));
                }
            }
            else if(it.num==2){
                in.add(it.node.data);
                it.num++;
                st.push(it);

                if(it.node.right!=null){
                    st.push(new Pair(it.node.right,1));
                }
            }
            else{
                post.add(it.node.data);
            }
        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }
}
