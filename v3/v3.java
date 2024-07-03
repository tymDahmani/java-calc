package v3;

import java.util.Scanner;

public class v3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        addition add = new addition();
        subtraction subt = new subtraction();
        multiplication multi = new multiplication();
        division division = new division();

        System.out.println("method 1: enter a and b, then operator");
        System.out.println("metjod 2: enter a, operator, then b");
        int method = scanner.nextInt();

        if (method == 1) {
            System.out.println("enter the first number: ");
            double a = scanner.nextDouble();

            System.out.println("what operation would you like to apply? ");
            char operator = scanner.next().charAt(0);

            System.out.println("enter the second number: ");
            double b = scanner.nextDouble();
            
            double c = 0;

            switch (operator) {
                case '+':
                    c = a + b;
                    break;
                case '-':
                    c = a - b;
                    break;
                case '*':
                    c = a * b;
                    break;
                case '/':
                    if (b != 0) {
                        c = a/ b;
                    } else {
                        System.out.println("error: division by zero isn't possible :/");
                    }
                    break;
                default:
                    System.out.println("error: please use the symbols '+, -, *, or/' for the operator");
            }

            System.out.println("result: " + c);
            
        }

       
    }
}