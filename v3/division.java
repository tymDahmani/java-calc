package v3;

public class division {
    double division(double a, double b) {
        double c = a / b;
        double d = a % b;
        if (d != 0) {
            System.out.println("remainder: " + d);
        }
        double quotient = c;
        return quotient;
    }
}
