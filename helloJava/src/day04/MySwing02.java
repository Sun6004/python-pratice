package day04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MySwing02 extends JFrame {

    private JPanel contentPane;
    private int count = 100;
    JLabel lbl;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MySwing02 frame = new MySwing02();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MySwing02() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        lbl = new JLabel(Integer.toString(count));
        lbl.setBounds(129, 174, 57, 15);
        contentPane.add(lbl);

        JButton btn = new JButton("increase");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                lbl.setText(Integer.toString(count));
            }
        });
        btn.setBounds(175, 170, 97, 23);
        contentPane.add(btn);
    }
    public void myClick() {
    	String a = lbl.getText();
    	int aa = Integer.parseInt(a);
    	aa++;
    	lbl.setText(aa+"");
    }
}
