public class Conditionals {
    public static void main(String[] args) {
        /*
        Syntax of if statements:
        if(boolean expression T or F) {
            //body
        } else {
           // do this
        }
        */

        int salary = 7000;

        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
        //prints 8000
    }
}