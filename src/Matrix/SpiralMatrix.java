package Matrix;
import java.util.*;
/* ek matrics dilele ahe tr aplayala spiral banvayach ahe..mahnje kontya kontya ne mag madhatale konte tya type
 tr tya sathi aplyala 4 for loop lagel ek side sathi ek loop.. */

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // input ghetal vari
        // pahile tr aaplya pahilya no chy element pasun dusrya no chya element praynt yayach ahe katha kathane
        // tya stathi sagle konte pahun chalave lagel..
        int rmin=0;// survat hot ahe row chi ithun
        int rmax=arr.length-1;// ithe row cha shevat ahe
        int cmin=0;// ithun colomn chi survat
        int cmax=arr[0].length-1;// coloum cha shevat
        int count=0;// kiti element print kelya vr thambayche te samjnyasathi
        int element=m*n;// akun element
        while(true){
            for(int i=rmin,j=cmin;i<=rmax && count<element ;i++){
                /*left hand side print krayachi ahe tr col badlnar ahe te 0 ahe tr 0 ch rahil row matra vadhat janar
                 tyansur 00 01 02 03 elemetn print honar khali*/
                System.out.print(arr[i][j]+" ");
                count++;
            }// cmin pahile aapla 0 hota ani aapan shevatacha elemetn 30 already print kela mahnun tyala vadhvun 1 kru
            cmin++;
            for(int i=rmax,j=cmin;j<=cmax && count<element;j++){
                /* ata row constant 3 vali an col vary hoil */
                System.out.print(arr[i][j]+" ");
                count++;
            }
            rmax--;// punha kontayach element adhich print kela mahnun varun suravat kraychi
            for(int i=rmax,j=cmax;i>=rmin && count<element;i--){
                /*ata punha col constant row vary hoil */
                System.out.print(arr[i][j]+" ");
                count++;
            }
            cmax--;//tasach punha
            for(int i=rmin,j=cmax;j>=cmin && count<element;j--){
                /*ata row constant an col vary hoil*/
                System.out.print(arr[i][j]+" ");
                count++;
            }
            rmin++;// tasach

        }


    }
}
