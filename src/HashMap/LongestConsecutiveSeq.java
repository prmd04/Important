package HashMap;
import java.util.*;
public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int arr[]={10,5,9,1,11,8,6,15,3,12,2};

        HashMap<Integer,Boolean>hm=new HashMap<>();
        for(int val:arr){
            hm.put(val,true);
        }
        for(int val:arr){
            if(hm.containsKey(val-1)){
                hm.put(val,false);
            }
        }
        int maxl=0;
        int startp=0;
        for(int val:arr){
            if(hm.get(val)==true){
                int tl=1;
                int tsp=val;
                while(hm.containsKey(tsp+tl)){
                    tl++;
                }
                if(tl>maxl){
                    maxl=tl;
                    startp=tsp;
                }
            }
        }
        for(int i=0;i<maxl;i++){
            System.out.print(startp+i +" ");
        }
    }
}
