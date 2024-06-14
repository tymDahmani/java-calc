import java.util.Scanner;

public class v1 {
    static String operation;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean keepCalculating = true;

        while (keepCalculating == true) {
            System.out.println("Usage Instructions:");
            System.out.println(
                    "to choose the operator: type either the symbol of the operator (+ for addition, - for subtraction, ");
            System.out
                    .println("* for multiplication, and / for division), or the operator name in the right spelling.");
            System.out.println("to exit the program, type \"exit\". enjoy!");
            System.out.println("What operation do you wish to do? (please just use integers)");
            operation = scanner.nextLine();
            if (operation.equals("addition") || operation.equals("+")) {
                System.out.println(
                        "please enter the numbers you would like to add (first number, 'enter key', second number)");
                int first_num = scanner.nextInt();
                int second_num = scanner.nextInt();
                int result = addition(first_num, second_num);
                System.out.println("the result: " + result);

            } else if (operation.equals("subtraction") || operation.equals("-")) {
                System.out.println(
                        "please enter the numbers you would like to subtracte (first number, 'enter key', second number)");
                int first_num = scanner.nextInt();
                int second_num = scanner.nextInt();
                int result = subtraction(first_num, second_num);
                System.out.println("the result: " + result);

            } else if (operation.equals("multiplication") || operation.equals("*")) {
                System.out
                        .println(
                                "enter the numebrs you would like to multiply (first number, 'enter key', second number)");
                int first_num = scanner.nextInt();
                int second_num = scanner.nextInt();
                int result = multiplication(first_num, second_num);
                System.out.println("the result:" + result);

            } else if (operation.equals("division") || operation.equals("/")) {
                System.out.println(
                        "enter the numbers you would like to divide from each other (first number, 'enter key', second number)");
                int first_num = scanner.nextInt();
                int second_num = scanner.nextInt();
                double result = division(first_num, second_num);
                double remainder = remainder(first_num, second_num);
                if (remainder != 0) {
                    System.out.println("the remainder: " + remainder);
                }
                System.out.println("the result: " + result);
            } else if (operation.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println(
                        "please type the symbol of the operation or the word of operation correctly to start calculating :)");
                continue;
            }

            scanner.nextLine();

            boolean validResponse = false;
            while (!validResponse) {
                System.out.println("would you like to calculate something more? [Y/N]");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("N")) {
                    keepCalculating = false;
                    validResponse = true;
                    System.out.println("see you around!");
                } else if (response.equalsIgnoreCase("Y")) {
                    keepCalculating = true;
                    validResponse = true;
                } else {
                    System.out.println("please enter either 'y' or 'n' as your response");
                    continue;
                }
            }
        }

        scanner.close();

    }

    public static int addition(int first_num, int second_num) {
        int result = first_num + second_num;
        return result;
    }

    public static int subtraction(int first_num, int second_num) {
        int result = first_num - second_num;
        return result;
    }

    public static int multiplication(int first_num, int second_num) {
        int result = first_num * second_num;
        return result;
    }

    public static double division(int first_num, int second_num) {
        double result = first_num / second_num;
        return result;
    }

    public static int remainder(int first_num, int second_num) {
        double remainder = first_num % second_num;
        return (int) remainder;
    }
}
