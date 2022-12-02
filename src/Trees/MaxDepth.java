package Trees;

public class MaxDepth{
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        System.out.println(maxDepth(root));
    }
    public static int maxDepth(Node root){
        if(root==null){
            return 0;
        }
//        int ls=maxDepth(root.left);
//        int rs=maxDepth(root.right);

        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
