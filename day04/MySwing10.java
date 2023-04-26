package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MySwing10 extends JFrame {

	private JPanel contentPane;
	private JTextField ts;
	private JTextField tf;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing10 frame = new MySwing10();
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
	public MySwing10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 264, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("첫 별수");
		lbl1.setBounds(22, 35, 57, 15);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("끝 별수");
		lbl2.setBounds(22, 71, 57, 15);
		contentPane.add(lbl2);
		
		ts = new JTextField();
		ts.setBounds(91, 68, 116, 21);
		contentPane.add(ts);
		ts.setColumns(10);
		
		tf = new JTextField();
		tf.setColumns(10);
		tf.setBounds(91, 32, 116, 21);
		contentPane.add(tf);
		
		JButton btn = new JButton("별 그리기");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCk();
			}
		});
		btn.setBounds(22, 96, 185, 23);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(22, 129, 185, 254);
		contentPane.add(ta);
	}
	
	int n = 0;
	int f = 0;
	String res = "";
	public void myCk() {
		n = Integer.parseInt(tf.getText());
		f = Integer.parseInt(ts.getText());
		for(int i = n-1; i <= f; i++) {
			for (int j = 1; j <= n-i; j++) {
				res += " ";
		    }
		    for (int k = 1; k <= i*2-1; k++) {
	            res += "*";
	        }
	            res += "\n";
	        }
		ta.append(res);
	}

}
