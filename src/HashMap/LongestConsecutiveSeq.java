// we want to find out longest consecutive seq
package HashMap;
import java.util.*;
public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int arr[]={10,5,9,1,11,8,6,15,3,12,2};
        // first we have to search which number can be starting point
        // of the sequence for that first we take map.
        // and assume that every number is the starting point
        HashMap<Integer,Boolean>hm=new HashMap<>();
        for(int val:arr){
            hm.put(val,true);
        }
        // but we know that every number cant be starting point so we
        // chake the val-1 prasent so can be val is starting point
        // means 10 is val and 9 is prasent so 10 cant be start point
        for(int val:arr){
            if(hm.containsKey(val-1)){// so where we found val-1
                // we set this val is false;
                hm.put(val,false);
            }
        }
        int maxl=0;// for max length
        int startp=0;// for start point in case we have to print
        for(int val:arr){ // again for loop
            if(hm.get(val)==true){// but this time only on true values
                int tl=1;// temprory length
                int tsp=val;// temperaory start point
                while(hm.containsKey(tsp+tl)){// we chake tsp+tl
                    tl++;
                }
                if(tl>maxl){ //which max stored
                    maxl=tl;
                    startp=tsp;
                }
            }
        }
        for(int i=0;i<maxl;i++){ // here print the sequence
            System.out.print(startp+i +" ");
        }
    }
}
