/*
Given two strings of lowercase English letters, A and B, perform the following operations:
Sum the lengths of  A and B .
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the first letter in  A and B  and print them on a single line, separated by a space.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0)
        System.out.println("Yes");
        else System.out.println("No");
        
        String a=A.substring(0,1);
        String aa="";
        if(A.length()>1) aa=A.substring(1);
        a=a.toUpperCase();
        A=a+aa;
        
        String b=B.substring(0,1);
        String bb="";
        if(B.length()>1) bb=B.substring(1);
        b=b.toUpperCase();
        B=b+bb;
        
        System.out.println(A+" "+B);
        
    }
}