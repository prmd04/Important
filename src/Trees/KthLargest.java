package Trees;
import java.util.*;
public class KthLargest {


    public static void main(String[] args) {
        int k=1;
        Node root=new Node(3);
        root.left=new Node(1);
        root.right=new Node(4);
        root.left.right=new Node(2);
        int answer=kthSmallest(root,k);
        System.out.println(answer);
    }
    public static int kthSmallest(Node root, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        while(root!=null || st.size()>0){
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else{
                root=st.pop();
                ans.add(root.data);
                if(ans.size()==k){
                    return ans.get(k-1);
                }
                root=root.right;
            }
        }
        return 0;
    }
}
