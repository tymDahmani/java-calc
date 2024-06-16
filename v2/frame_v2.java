
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frame_v2 extends JFrame implements ActionListener {

    JButton calculate;
    JTextField fstNum;
    JTextField sndNum;
    JTextField op;

    frame_v2() {
        
        calculate = new JButton();
        calculate.setBounds(162, 390, 95, 40);
        calculate.addActionListener(this);
        calculate.setText("calculate");
        calculate.setFocusable(false);
        calculate.setFont(new Font("Times New Roman", Font.BOLD,15));
        calculate.setForeground(Color.white);
        calculate.setBackground(new Color(54, 6, 89));
        calculate.setBorder(BorderFactory.createEtchedBorder());
        // method for making the button disabled before inputting the numbers to calculate: `calculate.setEnable(false);`
        // or, you can put this same like in the actionPerformed method to make it enabled only once (after inputting the numbers)

        this.setTitle("java-calc v2");
        ImageIcon icon = new ImageIcon("v2/other/sqrt(-1).png");
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fstNum =  new JTextField();
        fstNum.setPreferredSize(new Dimension(100, 40));
        fstNum.setBounds(117, 300, 50, 43);
        fstNum.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        fstNum.setForeground(Color.white);
        fstNum.setBackground(new Color(49, 49, 49));
        fstNum.setCaretColor(new Color(147, 0, 255));

        sndNum = new JTextField();
        sndNum.setPreferredSize(new Dimension(100, 40));
        sndNum.setBounds(250, 300, 50, 43);
        sndNum.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        sndNum.setForeground(Color.white);
        sndNum.setBackground(new Color(49, 49, 49));
        sndNum.setCaretColor(new Color(147, 0, 255));

        // op = new JTextField();
        // op.setPreferredSize(new Dimension(100, 40));
        // op.setBounds(189, 300, 40, 33);
        // op.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        // op.setForeground(Color.black);
        // op.setBackground(Color.white);
        // op.setCaretColor(new Color(147, 0, 255));
        // op.setText("+");

        String[] operators = {"+", "-", "*", "/"};
        JComboBox op = new JComboBox<>(operators);
        op.setBounds(189, 300, 40, 33);
        op.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        op.setForeground(Color.black);
        op.setBackground(Color.white);

        this.setResizable(false);
        this.setSize(420, 620);
        this.getContentPane().setBackground(Color.black); //rgb (the order of costume colors) usage (new Color(r,g,b)\or\)
        this.setVisible(true);
        this.add(calculate);
        this.add(fstNum);
        this.add(sndNum);
        // this.add(op);
        this.add(op);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==calculate) {
            System.out.println("yo, i should be calculating");
            // add calculating actions later
            String first_num = fstNum.getText();
            String second_num = sndNum.getText();
            // String operator = op.getText();
            
            System.out.println(first_num); // test
        }
    }
    
}
