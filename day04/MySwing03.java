package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MySwing03 extends JFrame {

	private JPanel contentPane;
	JTextField tf3;
	JTextField tf1;
	JTextField tf2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing03 frame = new MySwing03();
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
	public MySwing03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("+");
		lbl.setBounds(131, 124, 19, 15);
		contentPane.add(lbl);
		
		JButton btn = new JButton(" =");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myclick();
			}
		});
		btn.setBounds(259, 120, 66, 23);
		contentPane.add(btn);
		
		tf3 = new JTextField();
		tf3.setBounds(349, 121, 82, 21);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setBounds(12, 121, 97, 21);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(150, 121, 97, 21);
		contentPane.add(tf2);
		tf2.setColumns(10);
	}
	public void myclick() {
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		
		tf3.setText(a+b+"");
	}
}
