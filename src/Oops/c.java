package Oops;



import java.util.Scanner;
public class c{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans =reverse(num);
        System.out.println(ans);

    }
    public int reverse(int k){
        int rev=0;
        while(k>0){
            int rem=k%10;
            rev=rev*10+rem;
            k=k/10;
        }

        return rev;
    }
    public

}



