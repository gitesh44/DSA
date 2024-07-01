package Array;
import java.util.*;;

public class input2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //array of non primitive i.e String...


        String[] str=new String[5]; //Initialiation occur,memory got created in heap
                                    //It gonna contain 5 Object in heap;

        for (int i = 0; i < str.length; i++) {
            str[i]=in.next();

            System.out.println(Arrays.toString(str));
        }

    }
}
