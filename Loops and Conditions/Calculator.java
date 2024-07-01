import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int ans=0;
        while (true) {
            System.out.println("Enter the operator:  ");

            char op = in.next().charAt(0);  
            System.out.println();

            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%') {
                //input number
                System.out.println("enter two numbers:  ");

             int num1=in.nextInt();
             int num2=in.nextInt();

             System.out.println();

             if (op =='+') {
                ans=num1+num2;
                
             }
             if (op =='-') {
                ans=num1-num2;
                
             }
             if (op =='*') {
                ans=num1-num2;
                
             }
             if (op =='/') {
                ans=num1-num2;
                
             }
             if (op =='%') {
                ans=num1-num2;
                
             }
                break;
            }

        

        }
        System.out.println(ans);
    }
}
