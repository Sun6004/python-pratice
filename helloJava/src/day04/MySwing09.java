package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MySwing09 extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private String num = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing09 frame = new MySwing09();
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
	public MySwing09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 256, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.setBounds(22, 24, 184, 28);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "1";
				tf.setText(n);
			}
		});
		btn1.setBounds(22, 75, 53, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "2";
				tf.setText(n);
			}
		});
		btn2.setBounds(88, 75, 53, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "3";
				tf.setText(n);
			}
		});
		btn3.setBounds(154, 75, 52, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "4";
				tf.setText(n);
			}
		});
		btn4.setBounds(22, 117, 53, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "5";
				tf.setText(n);
			}
		});
		btn5.setBounds(88, 117, 53, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "6";
				tf.setText(n);
			}
		});
		btn6.setBounds(154, 117, 52, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "7";
				tf.setText(n);
			}
		});
		btn7.setBounds(22, 163, 53, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "8";
				tf.setText(n);
			}
		});
		btn8.setBounds(88, 163, 53, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "9";
				tf.setText(n);
			}
		});
		btn9.setBounds(156, 163, 50, 23);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = tf.getText();
				n += "0";
				tf.setText(n);
			}
		});
		btn0.setBounds(22, 207, 53, 23);
		contentPane.add(btn0);
		
		JButton call = new JButton("CALL");
		call.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click();
			}
		});
		call.setBounds(88, 207, 118, 23);
		contentPane.add(call);
	}
	public void click() {
		JOptionPane.showMessageDialog(null,"Calling... \n"+tf.getText());
	}

}
