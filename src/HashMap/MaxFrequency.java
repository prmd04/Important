package HashMap;
import java.util.*;
public class MaxFrequency {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        HashMap<String,Integer>hm=new HashMap<>();

        for(int i=0;i<n;i++){
            String st=arr[i];
            if(hm.containsKey(st)){
                int oldf=hm.get(st);
                int newf=oldf+1;
                hm.put(st,newf);
            }
            else{
                hm.put(st,1);
            }
        }
        String mfs=arr[arr.length-1];
        for(String key:hm.keySet()){
            if(hm.get(key)>hm.get(mfs)){
                mfs=key;
            }
        }
        System.out.println(mfs);
    }
}