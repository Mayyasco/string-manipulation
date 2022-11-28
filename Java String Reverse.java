/*Given a string A, print Yes if it is a palindrome, print No otherwise.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean st=true;
        int l =(int)A.length()/2;
        for(int i=0;i<l;i++)
        if(A.charAt(i)!=A.charAt(A.length()-i-1))
        {st=false; 
        break;}
        //System.out.println(l);
        if(st==true)System.out.println("Yes");
        else System.out.println("No");
           /* Enter your code here. Print output to STDOUT. */
        
    }
}



