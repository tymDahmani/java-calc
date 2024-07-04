// TODO: if i would like to do something further to this version, it would be to  add something makes the code get the user to the beginning of the case instead of the beginning of the whole program if they entered an invalid operator (or maybe even invalid inputs as the numbers (tbh i didn't even try that yet))

package v3;

import java.util.Scanner;

public class v3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        addition add = new addition();
        subtraction subt = new subtraction();
        multiplication multi = new multiplication();
        division division = new division();

        boolean go = true; // just a var for calculating
        OUTER:
        while (go = true) {
            System.out.println("method 1: enter a, operator, then b");
            System.out.println("method 2: enter a and b, then operator");
            System.out.println("0: exit");
            int method = scanner.nextInt();
            switch (method) {
                case 1:
                    {
                        System.out.println("enter the first number: ");
                        double a = scanner.nextDouble();

                        System.out.println("what operation would you like to apply? ");
                        char operator = scanner.next().charAt(0);

                        System.out.println("enter the second number: ");
                        double b = scanner.nextDouble();

                        double c = 0;
                        switch (operator) {
                            case '+' -> c = a + b;
                            case '-' -> c = a - b;
                            case '*' -> c = a * b;
                            case '/' -> {
                                // add something for the remainder here. -- remainder has been canceled cuz the division method has a double output - there should be no remainder.
                                if (b != 0) {
                                    c = a/ b;
                                } else {
                                    System.out.println("error: division by zero isn't possible :/");
                                }
                            }
                            default -> { System.out.println("error: please use the symbols '+', '-', '*', or '/' for the operator");
                            }
                        }
                        
                        System.out.println("result: " + c);
                        // just a line
                        System.out.println("");

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        
                        System.out.println("do you want to use the calculator again? [y/n]");
                        String var = scanner.next();

                        // just a line
                        System.out.println("");

                        if (var.equalsIgnoreCase("y")) {
                            go = true;
                            break;
                        } else {
                            go = false;
                            System.out.println("exiting.");
                            // just a line
                            System.out.println("");
                            break;
                        }
                    }
                case 2:
                    {
                        System.out.println("enter the first number: ");
                        double a  = scanner.nextDouble();

                        System.out.println("enter the second number: ");
                        double b = scanner.nextDouble();

                        System.out.println("enter the operator's symbol: ");
                        char operator = scanner.next().charAt(0);

                        double c = 0;

                        switch (operator) {
                            case '+' -> c = a + b;
                            case '-' -> c = a - b;
                            case '*' -> c = a * b;
                            case '/' -> {
                                if (b == 0) {
                                    System.out.println("error: can't divide on zero :/");
                                } else {
                                    c = a / b;
                                }
                            }
                            default -> System.out.println("error: please use the symbols '+', '-', '*', or '/' for the operator");
                        }

                        System.out.println("result: " + c);
                        // just an empty line
                        System.out.println("");

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        
                        System.out.println("do you want to use the calculator again? [y/n]");
                        String var = scanner.next();

                        // just a line
                        System.out.println("");

                        if (var.equalsIgnoreCase("y")) {
                            go = true;
                            break;
                        } else {
                            go = false;
                            System.out.println("exiting.");
                            // just a line
                            System.out.println("");
                            break;
                        }
                    } 
                    
                case 0:
                    System.out.println("exiting.");
                    break OUTER;
                default:
                    System.out.println("invalid method input. please enter from the list.");
                    // continue;
            }

        }
    }
}