package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class MySwing06 extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private String com;
	
	Random rand = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing06 frame = new MySwing06();
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
	public MySwing06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("나: ");
		lbl1.setBounds(91, 50, 57, 15);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("컴: ");
		lbl2.setBounds(91, 75, 57, 15);
		contentPane.add(lbl2);
		
		t1 = new JTextField();
		t1.setBounds(114, 47, 116, 21);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(114, 72, 116, 21);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(114, 100, 116, 21);
		contentPane.add(t3);
		
		JLabel lbl3 = new JLabel("결과: ");
		lbl3.setBounds(77, 103, 57, 15);
		contentPane.add(lbl3);
		
		JButton btn = new JButton("Game Start");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCk();
			}
		});
		btn.setBounds(114, 131, 116, 23);
		contentPane.add(btn);
	}
	public void myCk() {
		String res = "";
		String me = t1.getText();
		int a = rand.nextInt(3);
		
		if(a == 0) {
			com = "가위";
		} else if(a == 1) {
			com = "바위";
		} else if(a == 2) {
			com = "보";
		}
		
		t2.setText(com);
		
		if(me.equals(com)) {
			res = "무승부";
		} else if(me.equals("가위") && com.equals("바위") || 
				me.equals("바위") && com.equals("보") ||
				me.equals("보") && com.equals("가위")) {
			res = "패배 ㅠㅠ";
		} else {
			res = "승리!";
		}	
		t3.setText(res);
	}

}
