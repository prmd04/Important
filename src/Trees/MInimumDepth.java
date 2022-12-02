package Trees;

public class MInimumDepth {
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        System.out.println(minDepth(root));
    }
    public static int minDepth(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left!=null && root.right!=null){
            int ls=minDepth(root.left);
            int rs=minDepth(root.right);

            return 1+Math.min(ls,rs);
        }
        if(root.left!=null){
            return  1+minDepth(root.left);
        }
        return 1+minDepth(root.right);
    }
}
