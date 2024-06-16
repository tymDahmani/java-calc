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



        
    }
}
