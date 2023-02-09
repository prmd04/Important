package Array;


import java.util.*;

public class ArrayReversefromspecificPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int m=3;
        int arr[]={1,2,3,4,5,6};
        //rev(arr,m);
        reverseArray(list,m);


    }
    public static void rev(int [] list,int m){
        int s=m+1;
        int e=list.length-1;
        while(s<e){
           int temp=list[s];
           list[s]=list[e];
           list[e]=temp;
           s++;e--;
        }
        System.out.println(Arrays.toString(list));
    }
    public static void reverseArray(ArrayList<Integer> arr, int m){
        {
            ArrayList<Integer>ans=new ArrayList<>();
            for(int i=0;i<=m;i++){
                ans.add(arr.get(i));
            }
            for(int i=arr.size()-1;i>m;i--){
                ans.add(arr.get(i));
            }
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
        }
    }

}
