package Trees;
import java.util.*;
public class ZigZagTraversal{
    public static void main(String[] args) {
        Node root;
        root=new Node(25);
        root.left=new Node(20);
        root.right=new Node(36);
        root.left.left=new Node(10);
        root.left.right=new Node(22);
        root.right.left=new Node(30);
        root.right.right=new Node(40);
        root.left.left.left=new Node(8);
        root.left.left.right=new Node(12);
        root.left.right.left=new Node(21);
        root.left.right.right=new Node(24);
        //preorder(root);
        System.out.println(zigZagTrav(root));



    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static ArrayList<Integer> zigZagTrav(Node root){
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        int level=0;
        if(root==null){
            return ans;
        }
        level++;
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Integer>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
                list.add(temp.data);
            }
            if(level%2==0){
                for (int i = list.size()-1; i >=0 ; i--) {
                    ans.add(list.get(i));
                }

            }
            else{
                for(int i=0;i<list.size();i++){
                    ans.add(list.get(i));
                }
            }
            level++;
        }

        return ans;
    }
}
