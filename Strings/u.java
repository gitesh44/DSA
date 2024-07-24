package Strings;
import java.util.*;

public class u {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        // Toggle case
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                str.setCharAt(i, Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                str.setCharAt(i, Character.toUpperCase(ch));
            }
        }
        System.out.println(str.toString());
    }
}