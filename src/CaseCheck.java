import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("Uppercase");
        }

        String word = "hello";
        System.out.println(word.charAt(0));
        //prints h
        //The reason is because, charAt() separates a String value to single characters,
        //which each of them come with their own index number.
    }
}
