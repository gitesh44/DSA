import java.util.Scanner;
public class Number_Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num%2==0) {
            System.out.println("the number is even");
            
        }
        else{
            System.out.println("the number is Odd");
        }
    }

    
}
