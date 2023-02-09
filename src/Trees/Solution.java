package Trees;

public class Solution {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(4);
        root.left.left=new Node(5);
        root.left.right=new Node(2);
        root.right.left=new Node(7);
        root.right.right=new Node(6);
    }
}
