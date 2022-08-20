import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count<= n) { // 2 <= 7
            int previousNumber = b; //temp stores b value = 1
            b = a + b;
            a = previousNumber;     //a stores temp value = 1
            count++;

        }
        System.out.println(b);
    }
}
