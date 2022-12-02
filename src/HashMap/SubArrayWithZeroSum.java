package HashMap;
import java.util.*;
public class SubArrayWithZeroSum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    HashMap<Integer,Integer>hm=new HashMap<>();
    int sum=0;
    hm.put(0,1);
    Boolean flag=false;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(hm.containsKey(sum)){
            System.out.println("True");
            flag=true;
            break;
        }
        else{
            hm.put(sum,1);
        }
    }
    if (!flag) {
        System.out.println("false");
    }

}
}

