import java.util.Scanner;

public class v1 {
    static String operation;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation do you wish to do?");
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
                    .println("enter the numebrs you would like to multiply (first number, 'enter key', second number)");
            int first_num = scanner.nextInt();
            int second_num = scanner.nextInt();
            int result = multiplication(first_num, second_num);
            System.out.println("the result:" + result);

        } else if (operation.equals("division") || operation.equals("/")) {
            System.out.println(
                    "enter the numbers you would like to divide from each other (first number, 'enter key', second number)");
            int first_num = scanner.nextInt();
            int second_num = scanner.nextInt();
            int result = division(first_num, second_num);
            System.out.println("the result: " + result);
        }
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

    public static int division(int first_num, int second_num) {
        double result = first_num / second_num;
        double remainder = first_num % second_num;
        if (remainder != 0) {
            System.out.println(remainder);
            return (int) remainder;
        }
        return (int) result;
    }
}
