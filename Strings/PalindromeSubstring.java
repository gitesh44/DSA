package Strings;
import java.util.*;
public static boolean isPalindrome(String s){
    int i=0;
    int j=s.length()-1;
    while(i<j){

        if.s.charAt(i)!=s.charAt(j)) return false;

        i++;
        j--;
    }
    return true;
}


}
public class PalindromeSubstring {
    String str="abbd";
    int count=0;
    for(int i=0;i<str.length();i++){
        for(int j=i+1;i<str.length();j++)
        if(isPalindrome(str.substring(i,j))==true){
            System.out.print(str.substring(i,j)+" ");
            count++;
        }
        
    }
}
