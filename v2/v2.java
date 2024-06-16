import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class v2 {
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("v2/other/mcskullwatchingyou(klein).png");
        

        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);

        frame_v2 frame = new frame_v2();
        frame.add(label);

        if(frame.op.equals("+")) {
            // addition(frame.fstNum, frame.sndNum); // look up here: "https://stackoverflow.com/questions/1313390/is-there-any-way-to-accept-only-numeric-values-in-a-jtextfield" to fix the JTextField input problem
        }



        
    }

    public int addition(int first_num, int second_num) {
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

}
