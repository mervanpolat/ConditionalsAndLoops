import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        //Q: Find the largest num of three num

        int max = a;

        if (b > max) {
            max = b;
            if (c >max) {
                max = c;
            }
        }

        System.out.println(max);


    }
}
