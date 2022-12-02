package HashMap;
import java.util.*;
public class MissingNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a1[]=new int[n];
        for (int i = 0; i < n; i++) {
            a1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int a2[]=new int[m];
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
        }
        ArrayList<Integer>ans=missingNum(n,a1,m,a2);
        for(int s:ans){
            System.out.print(s+" ");
        }
    }
    static ArrayList missingNum(int n,int a1[],int m,int a2[]){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int val:a1){
            if(hm.containsKey(val)){
                int of=hm.get(val);
                int nf=of+1;
                hm.put(val,nf);
            }
            else{
                hm.put(val,1);
            }
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int val:a2){
            if(hm.containsKey(val)){
                int of=hm.get(val);
                int nf=of-1;
                hm.put(val,nf);
                if(hm.get(val)==0){
                    hm.remove(val);
                }
            }
            else{
                list.add(val);
            }
        }
        Collections.sort(list);
        return list;
    }
}
