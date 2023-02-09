package Trees;
import java.util.*;
public class UpperViewofBST {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        root.left.left= new Node(40);
        root.left.right= new Node(60);
        root.right.left= new Node(90);
        root.right.right= new Node(100);
        System.out.println(topview(root));

    }
    public static ArrayList<Integer> topview(Node root){
        ArrayList<Integer>list=new ArrayList<>();
        Queue<pair>q=new LinkedList<>();
        Map<Integer,Integer>map=new TreeMap<>();
        q.add(new pair(0,root));
        while(!q.isEmpty()){
            pair temp=q.poll();
            if(!map.containsKey(temp.hd)){
                map.put(temp.hd,temp.node.data);
            }
            if(temp.node.left!=null){
                q.offer(new pair(temp.hd-1,temp.node.left));
            }
            if(temp.node.right!=null){
                q.offer(new pair(temp.hd+1,temp.node.right));
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
class pair{
    int hd;
    Node node;

    public pair(int hd, Node node){
        this.hd=hd;
        this.node=node;
    }
}