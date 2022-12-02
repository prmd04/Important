package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MediunOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println( Median(arr,n));
    }
    public static int Median(int arr[][],int n){
        int arr1[]=new int[n*n];
        int a=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a<arr1.length){
                    arr1[a]=arr[i][j];
                    a++;

            }
        }

        }
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int med=arr1.length/2;
        return arr1[med];
    }
}
