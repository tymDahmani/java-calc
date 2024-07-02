package v3;

import java.util.Scanner;

public class v3 {
    public static void main (String[] args) {

        addition addition = new addition();
        subtraction subtraction = new subtraction();
        multiplication multiplication = new multiplication();
        division division = new division();
        Scanner sc = new Scanner(System.in);

        // initializing the inputs
        System.out.println("please enter the numbers you would like to operate on: ");
        double a = sc.nextDouble(); // this shit seems to only work with commas as double/float numbers - dots don't work
        double b = sc.nextDouble();

        System.out.println(
            "enter the operation name or its symbol: "
        );
        String operator = sc.nextLine(); 
        // main if statement:
        if (operator.equalsIgnoreCase("addition") || operator.equals("+")) {
            double sum = addition.addtion(a, b);
            System.out.println("sum: " + sum);
        } else if (operator.equalsIgnoreCase("subtraction") || operator.equals("-")) {
            double difference = subtraction.subtraction(a, b);
            System.out.println("difference: " + difference);
        } else if (operator.equalsIgnoreCase("multiplication") || operator.equals("*")) {
            double product = multiplication.multiplication(a, b);
            System.out.println("product: " + product);
        } else if (operator.equalsIgnoreCase("division") || operator.equals("/")) {
            double quotient = division.division(a, b);
            System.out.println("quotient: " + quotient);
        }
    }
}