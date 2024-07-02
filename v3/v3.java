package v3;

import java.util.Scanner;

public class v3 {
    public static void main (String[] args) {

        addition addition = new addition();
        subtraction subtraction = new subtraction();
        Scanner sc = new Scanner(System.in);

        // initializing the inputs
        double a = sc.nextDouble(); // this shit seems to only work with commas as double/float numbers - dots don't work
        double b = sc.nextDouble();

        // main if statement:
        if (sc.nextLine().equalsIgnoreCase("addition") || sc.nextLine().equalsIgnoreCase("+")) {
            double result = addition.addtion(a, b);
            System.out.println("sum: " + result);
        } else if (sc.nextLine().equalsIgnoreCase("subtraction") || sc.nextLine().equalsIgnoreCase("-")) {
            double result = subtraction.subtraction(a, b);
            System.out.println("subtraction: " + result);
        } else if (sc.nextLine().equalsIgnoreCase("multiplication") || sc.nextLine().equalsIgnoreCase("*")) {
            // hi ?
        }

        double sum = addition.addtion(a, b);
        System.out.println(sum);
    }
}