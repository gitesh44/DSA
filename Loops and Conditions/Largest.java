import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {


        //To find the largest of 3 numbers.
  
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of A: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b=sc.nextInt();
        System.out.println("Enter the value of C: ");
        int c=sc.nextInt();
        /*
        int max = a;
        if (b> max) {
            max=b;
        }
        if (c > max) {
            max=c;
            
        }
        System.out.println("the largest elements is"  + max);

        *************************** oR ****************************/


        
        int max=Math.max(c,Math.max(a, b));

        System.out.println(max);

    }
}
