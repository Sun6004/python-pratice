package day04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class MySwing05 extends JFrame {
	
	JLabel lbl;
	JLabel lbl2;
	JLabel lbl3;
	JLabel lbl4;
	JLabel lbl5;
	JLabel lbl6;
	
	Random rd = new Random();
	int lotto = rd.nextInt(45) + 1;
	int[] lottoNum;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing05 frame = new MySwing05();
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
	public MySwing05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("__");
		lbl.setBounds(44, 66, 57, 15);
		contentPane.add(lbl);
		
		lbl2 = new JLabel("__");
		lbl2.setBounds(206, 66, 57, 15);
		contentPane.add(lbl2);
		
		lbl3 = new JLabel("__");
		lbl3.setBounds(99, 66, 57, 15);
		contentPane.add(lbl3);
		
		lbl4 = new JLabel("__");
		lbl4.setBounds(155, 66, 57, 15);
		contentPane.add(lbl4);
		
		lbl5 = new JLabel("__");
		lbl5.setBounds(316, 66, 57, 15);
		contentPane.add(lbl5);
		
		lbl6 = new JLabel("__");
		lbl6.setBounds(262, 66, 57, 15);
		contentPane.add(lbl6);
		
		JButton btn = new JButton("로또 생성하기");
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				myCk();
			}
		});
		btn.setBounds(134, 108, 143, 23);
		contentPane.add(btn);
	}
	
	public void myCk() {
	    int[] arr = new int[6];   
	    boolean[] chk = new boolean[45+1];
	    int count = 0;

	    while (count < 6) {
	        int num = rd.nextInt(45) + 1;
	        if (!chk[num]) {
	            arr[count] = num;
	            chk[num] = true;
	            count++;
	        }
	    }
	    int a = arr[0];
	    int b = arr[1];
	    int c = arr[2];
	    int d = arr[3];
	    int e = arr[4];
	    int f = arr[5];
	    
	    lbl.setText(a+"");
	    lbl2.setText(b+"");
	    lbl3.setText(c+"");
	    lbl4.setText(d+"");
	    lbl5.setText(e+"");
	    lbl6.setText(f+"");
	}


}
