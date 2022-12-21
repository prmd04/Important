package HashMap;
import java.util.*;
public class PairSumDivisibleCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(paird(arr,k));
    }

//        int target=sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if((arr[i]+arr[j])%target==0){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//}}
        public static int paird(int arr[],int k) {
            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                int rem = arr[i] % k;
                int comr = (k - rem) % k;
                if (map.containsKey(comr)) {
                    count += map.get(comr);
                }
               map.put(rem,map.getOrDefault(rem,0)+1);
            }
            return count;
        }
}