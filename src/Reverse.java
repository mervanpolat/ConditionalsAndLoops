public class Reverse {
    public static void main(String[] args) {
        int num = 28479;
        int ans = 0;

        //Execute the following code until num is no longer greater than zero
        while (num > 0) {
            //Get the last digit of num
            int rem = num % 10;
            //Go to the next digit
            num /= 10;
            //Reverse operation
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
        //97482
    }
}
