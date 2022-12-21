package HashMap;
import java.util.*;
public class ContainDuplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        HashMap<Integer,Integer>hm=new HashMap<>();
//        for(int i=0;i<n;i++){
//            if(hm.containsKey(arr[i])){
//                int oldf=hm.get(arr[i]);
//                int newf=oldf+1;
//                hm.put(arr[i],newf);
//            }
//            else{
//                hm.put(arr[i],1);
//            }
//        }
//        Boolean ans=false;
//        for(int i=0;i<n;i++){
//            if(hm.get(arr[i])>=2){
//                System.out.println(true);
//                ans=true;
//                break;
//            }
//        }
//        if(!ans){
//            System.out.println(false);
//        }
//    }
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        if(set.size()==arr.length){
            System.out.println(false);
        }
        else
            System.out.println(true);
    }
}
