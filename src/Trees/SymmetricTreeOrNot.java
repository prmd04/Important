package Trees;
class SymmetricTreeOrNot {
    Node root;

    void insert(int key) {
        root = insertrec(root, key);
    }

    private Node insertrec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (root.data > key) {
            root.left = insertrec(root.left, key);
        }
        if (root.data < key) {
            root.right = insertrec(root.right, key);
        }
        return root;
    }

    boolean isSymeetry(Node root) {
        return isMirror(root, root);
    }

    private static boolean isMirror(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 != null && node2 != null && (node1.data == node2.data)) {
            return (isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left));
        }
        return false;
    }

}

