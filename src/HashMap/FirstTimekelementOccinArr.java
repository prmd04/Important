package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstTimekelementOccinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans=firstElement(arr,n,k);
        System.out.println(ans);

    }
    static int firstElement(int arr[],int n,int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
               hm.put(arr[i],hm.get(arr[i])+1);
               if(hm.get(arr[i])>=k){
                   return arr[i];
               }
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==k){
                return arr[i];
            }
        }
        return -1;

        }
    }


