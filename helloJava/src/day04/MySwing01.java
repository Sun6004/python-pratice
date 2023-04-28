package day04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing01 extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySwing01 frame = new MySwing01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MySwing01() {
		setBackground(new Color(51, 153, 204));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 547);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel("Good night");
		lbl.setForeground(Color.WHITE);
		lbl.setBounds(188, 155, 97, 44);
		contentPane.add(lbl);
		
		JButton btn = new JButton("click");
		btn.addMouseListener(new MouseAdapter() {
		});
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lbl.getText().equals("Good night")) {					
					lbl.setText("Good Morning");
					contentPane.setBackground(Color.ORANGE);
					contentPane.setForeground(Color.RED);
				}else {
					lbl.setText("Good night");
					contentPane.setBackground(Color.GRAY);
					contentPane.setForeground(Color.WHITE);
				}
			}
		});
		btn.setBounds(188, 194, 97, 23);
		contentPane.add(btn);
	}
}
