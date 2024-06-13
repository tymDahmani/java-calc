import java.util.Scanner;

public class v1 {
    static int operation;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation do you wish to do? (1 = addition)");
        operation = scanner.nextInt();
        if (operation == 1) {
            System.out.println("please enter the numbers you would like to add (first number, second number)");
            int first_num = scanner.nextInt();
            int second_num = scanner.nextInt();
            int result = addition(first_num, second_num);
            System.out.println("the result: " + result);
        } else if (operation == 2) {

        }
    }

    public static int addition(int first_num, int second_num) {
        int result = first_num + second_num;
        return result;
    }
}
