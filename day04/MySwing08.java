package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class MySwing08 extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing08 frame = new MySwing08();
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
	public MySwing08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(99, 22, 128, 21);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lib = new JLabel("단수");
		lib.setBounds(30, 25, 57, 15);
		contentPane.add(lib);
		
		JButton btn = new JButton("출력");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCk();
			}
		});
		btn.setBounds(30, 53, 198, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(30, 91, 198, 225);
		contentPane.add(ta);
	}
	
	public void myCk() {
		 int a = Integer.parseInt(t1.getText());
		 String res = "";
		 for (int i = 1; i <= 9; i++) {
		     res += "\t"+a + "X" + i + "=" + (a * i) + "\n";
		 } 
		 ta.append(res);
	}
}
