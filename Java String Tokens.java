/*
Given a string,s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
On the first line, print an integer,n , denoting the number of tokens in string  (they do not need to be unique).
 Next, print each of the  tokens on a new line in the same order as they appear in input string .
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[]tokens = s.trim().split("[\\?\\'@,\\._!\\s]+");
        int l=tokens.length;
        int i=0;
        if (tokens.length>0 && tokens[0].isEmpty()){i=1;l--;}
        System.out.println(l);
        for( ;i<tokens.length;i++)
        System.out.println(tokens[i]);
        scan.close();
    }
}

