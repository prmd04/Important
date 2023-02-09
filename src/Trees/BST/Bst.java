package Trees.BST;
import java.util.*;
class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val=val;
        left=right=null;
    }

}
class BinSerchTree{
    Node root;

    void insert(int key){
        root=insertrec(root,key);
    }
    private Node insertrec(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(root.val>key){
            root.left=insertrec(root.left,key);
        }
        else if(root.val<key){
            root.right=insertrec(root.right,key);
        }
        return root;
    }
    void preorder(){
        preorderrec(root);
    }

    private void preorderrec(Node root){
        if(root==null) {
            return;
        }
        System.out.print(root.val+" ");
        preorderrec(root.left);
        preorderrec(root.right);
    }
    void innorder(){
        innorderrec(root);
    }

    private void innorderrec(Node root) {
        if(root==null){
            return;
        }
        innorderrec(root.left);
        System.out.print(root.val+" ");
        innorderrec(root.right);
    }
    void leveloreder(){
        leveloredern(root);
    }

    private void leveloredern(Node root) {
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                System.out.print(temp.val+" ");
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            System.out.println();
        }
    }
    void search(int key){
        if(searchr(root, key)){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
     Boolean searchr(Node root,int key) {
         if (root == null) {
             return false;
         }
         if (root.val == key) {
             return true;
         }
         if (root.val > key) {
             return searchr(root.left, key);
         } else
             return searchr(root.right, key);

     }
    void lca(int p,int q){
        int ans=lcarec(root,p,q);
    }
    private int lcarec(Node root,int p,int q){
        if(root==null){
            return 0;
        }
        if(root.val<p && root.val<q){
            return lcarec(root.left,p,q);
        }
        if(root.val>p && root.val>q){
            return lcarec(root.right,p,q);
        }
        else
            return root.val;
    }
    void isBSt(){
        System.out.println(isBST(root));
    }
    private Boolean isBST(Node node)
    {
        if (node == null)
            return true;

        /* False if left is > than node */
        if (node.left != null && node.left.val > node.val)
            return false;

        /* False if right is < than node */
        if (node.right != null && node.right.val < node.val)
            return false;

        /* False if, recursively, the left or right is not a BST
         */
        if (!isBST(node.left) || !isBST(node.right))
            return false;

        /* Passing all that, it's a BST */
        return true;
    }
    void insertit(int key){
        insertIt(root,key);

    }
    private Node insertIt(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        Node prev=null;
        Node temp=root;
        while(temp!=null){
            if(temp.val>key){
                prev=temp;
                temp=temp.left;
            }
            else if(temp.val<key){
                prev=temp;
                temp=temp.right;
            }
        }
        if(prev.val>key){
            prev.left=new Node(key);
        }
        else{
            prev.right=new Node(key);
        }
        return root;
    }
    void leftview(){
        leftviewrec(root);
    }

    private void leftviewrec(Node root) {
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            int n=q.size();
            for(int i=0;i<n;i++){
                Node temp=q.poll();
                if(i==0){
                    System.out.print(temp.val+" ");
                }
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
        }
    }


}
public class Bst {
    static Node root;
    public static void main(String[] args) {
        BinSerchTree tree=new BinSerchTree();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Val[]=new int[n];
        for(int i=0;i<n;i++){
            Val[i]=(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            tree.insert(Val[i]);
        }

        tree.leveloreder();



    }



}
