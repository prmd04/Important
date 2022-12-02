package Matrix;
import java.util.*;
/* To hame program mai diya gaya hai ki ek sorted matrix ahe. tyat elemeent seaech krayach ahe.
jr aapan aapllya padhtine kel tri ans yete pan time complxity O(n^2) madhe jate tr yala jr O(n) madhe solve krayach
asel tr pahile konta pakadayacha.. mahje pahilya row cha last element jr to target peksha motha asel.. tr tya line
madhe sagale tya peksha kamich asel mg aaplyla to milun jail*/

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=3;
        int n=4;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // in above we get input in 2D arrays;
        int target=sc.nextInt();
        System.out.println(Search(arr,m,n,target));
    }
    public static boolean Search(int arr[][],int m,int n,int target){
        int i=0;
        int j=arr[0].length-1;
        // arr[0][3] kontachya element ahe tech tr pahije aaplyala mahunun j chi value ti ghetali
        while(i<arr.length && j>=0){// jo prayant row shillak ahe ani j smage shunya paryant jau shakala pahije
            if(target==arr[i][j]){// jr target bhetala tr
                return true;// chala ghari
            }
            else if(target<arr[i][j]){// target lahan ahe mahnje to tyach line madhe ahe j-- kra ani shodha
                j--;
            }
            else {// target motha ahe mahnje row change kravi lagel tya row madhe tr nahi ahe
                i++;
            }
        }
        return false;// bhetala nahi tr ahe pan nahi..
    }
}
