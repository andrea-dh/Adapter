package sample;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int count=0, same=0;
        String[] one=new String[A.length()];
        String[] two=new String[A.length()];



        for(int i=0; i<A.length(); i++){
            one[i]= String.valueOf(A.charAt(i));
            two[i]=String.valueOf(A.charAt(6-i));
            if(one[i]==two[i]){
                continue;
            }
            else{
                System.out.println("No");
                break;
            }
        }

        if(same==A.length()) System.out.println("Yes");
        else


        /* Enter your code here. Print output to STDOUT. */

    }
}