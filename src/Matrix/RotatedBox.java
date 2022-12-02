package Matrix;
import java.util.*;
public class RotatedBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char box[][] ={};
        int row = box.length;
        int col = box[0].length;
        rotateMatrix(box,row,col);

    }
    public static char[][] shift(char[][] box, int row, int col) {
        for (int i = 0; i < row; i++) {
            int empty = col - 1;
            for (int j = col - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    empty = j - 1;
                }
                if (box[i][j] == '#') {
                    char temp = box[i][j];
                    box[i][j] = box[i][empty];
                    box[i][empty] = temp;
                    empty--;
                }
            }
        }
        return box;
    }
    public static char[][]transpose(char box[][],int row,int col){
        char box1[][]=new char[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                box1[j][i]=box[i][j];
            }
        }
        return box1;
    }
    public static void rotateMatrix(char box[][],int row,int col){
        box=shift(box,row,col);
        box=transpose(box,row,col);
        for(int i=0;i<col;i++){
            for(int j=0;j<row/2;j++){
                char temp=box[i][j];
                box[i][j]=box[i][row-j-1];
                box[i][row-j-1]=temp;
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(box[i][j]);
            }
            System.out.println();
        }
    }
}