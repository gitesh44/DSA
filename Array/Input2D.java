package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Input2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


       

        int[][] arr=new int[3][2];
        //System.out.println(arr.length); //no of rows
        
        //input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
    }
}
