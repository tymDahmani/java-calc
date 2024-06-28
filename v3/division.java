package v3;

public class division {
    void division(int a, int b) {
        double c = a / b;
        double d = a % b;
        if (d != 0) {
            System.out.println("remainder: " + d);
        }
        System.out.println("quotient: " + c);
    }
}
