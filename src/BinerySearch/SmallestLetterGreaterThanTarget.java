package BinerySearch;
/* Q: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 Given a characters array letters that is sorted in non-decreasing order
 and a character target,
 return the smallest character in the array that is larger than target.
 Ex:Input: letters = ["c","f","j"], target = "a"
Output: "c"

Note:  that the letters wrap around.
 */


// This quetion is exactly same as ceiling of number with small changes
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char arr[]={'c','f','j'};
        char target='j';
        System.out.println(nextGreaterElement(arr,0,arr.length-1,target));
    }
    public static char nextGreaterElement(char letters[],int s,int e,char target){
        if(s>e){
            return letters[s%letters.length];
        }
        int mid=s+(e-s)/2;
        if(letters[mid]>target){
            return nextGreaterElement(letters, s, mid-1, target);
        }
        else
            return nextGreaterElement(letters, mid+1, e, target);

    }
}
