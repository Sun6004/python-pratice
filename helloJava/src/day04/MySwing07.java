package day04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MySwing07 extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing07 frame = new MySwing07();
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
	public MySwing07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(23, 10, 75, 21);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(163, 10, 57, 21);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(295, 10, 67, 21);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(495, 10, 116, 21);
		contentPane.add(t4);
		
		JLabel lbl1 = new JLabel("부터");
		lbl1.setBounds(121, 13, 57, 15);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("까지");
		lbl2.setBounds(238, 13, 57, 15);
		contentPane.add(lbl2);
		
		JButton btn = new JButton("배수의 합은");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCk();
			}
		});
		btn.setBounds(386, 9, 97, 23);
		contentPane.add(btn);
	}
	
	public void myCk() {
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		int c = Integer.parseInt(t3.getText());
		
		int sum = 0;
		for(int i=a; i<=b; i++) {
			if(i % c == 0) {
				sum += i;
			}
		}
		t4.setText(sum+"");
	}

}
