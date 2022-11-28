/*
Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
*/
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        int st=0;
        int en=k;
        smallest=s.substring(st,en);
        largest=s.substring(st,en);
        String sub;
        for(int i=0;i+k<=s.length();i++)
        {
        sub=s.substring(i,i+k);
        if(smallest.compareTo(sub)>0)smallest=sub;
        if(largest.compareTo(sub)<0)largest=sub;
        }
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}