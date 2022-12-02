package Trees;

import java.util.*;
public class LevalOrder {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(levelO(root));

    }
    public static List<List<Integer>> levelO(Node root){
        List<List<Integer>>ans=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(q.size()>0){
            int n=q.size();
            ArrayList<Integer>sublist=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                sublist.add(temp.data);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            ans.add(sublist);
        }
        return ans;
    }
}
