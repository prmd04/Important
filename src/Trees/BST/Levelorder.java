package Trees.BST;
import java.util.*;
public class Levelorder {
    public static void main(String[] args) {
        BinSerchTree node=new BinSerchTree();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            node.insert(sc.nextInt());
        }
        node.leveloreder();
    }
}
