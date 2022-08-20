import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        //Q: print numbers from 1 to 5
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        //Q: print numbers from 1 to 1000

        for (int i = 1; i<=1000; i++) {
            System.out.println("Number: " + i);
        }


        /* do-while statement

        do {

        //body

        } while (condition);

        */

        int n = 1;
        do {
            System.out.println(n);
        } while (n!=1);

        //prints 1


    }
}
