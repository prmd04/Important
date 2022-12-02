package Trees.BST;

import java.util.*;
public class BinerySearch {
    public static void main(String[] args) {
        BinSerchTree obj=new BinSerchTree();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            obj.insert(sc.nextInt());
        }
        obj.search(key);
    }

}
