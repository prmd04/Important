package Matrix;
import java.util.*;
public class TransposeMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col= sc.nextInt();
        int mat[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        transpose(mat,row);
        display(mat,row);
    }
    public static void display(int arr[][],int n){
        System.out.println(" Real matrix before the transpose");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void transpose(int arr[][],int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
//time complexity =0(n*m);
//space complexity=O(1);