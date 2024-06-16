
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class frame_v2 extends JFrame {

    frame_v2() {
        
        this.setTitle("java-calc v2");
        ImageIcon icon = new ImageIcon("v2/other/sqrt(-1).png");
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(false);
        this.setSize(420, 420);
        this.getContentPane().setBackground(Color.black); //rgb (the order of costume colors) usage (new Color(r,g,b)\or\)
        this.setVisible(true);

    }
    
}
