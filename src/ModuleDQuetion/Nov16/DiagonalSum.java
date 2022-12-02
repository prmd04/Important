package ModuleDQuetion.Nov16;
import java.util.*;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(sumDigonal(mat,n));

    }

    private static int sumDigonal(int[][] mat, int n) {
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || (i+j)==(n-1)) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
