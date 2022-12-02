package Matrix;
import java.util.*;
public class TransposeMatrixWithDistRowCol {
    public static void transpose(int mat[][],int row,int col){
        int trans_mat[][]=new int[col][row];
        //fkt navin banvatana arr banvatana row ch col and col ch row kraycha
        // baki jashala tas
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans_mat[j][i]=mat[i][j];
            }
        }
        display(trans_mat,row,col);
    }
    public static void display(int mat[][],int row,int col){
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        transpose(mat,row,col);
    }
    //time complexity= 0(n*m)
    //space complexity=0(n*m)
}
