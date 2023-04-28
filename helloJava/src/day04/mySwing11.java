package day04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class mySwing11 extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextArea t2;
	private String com = "123";
	Random rand = new Random();

	public void setRandom() {
		
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mySwing11 frame = new mySwing11();
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
	public mySwing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(101, 35, 116, 21);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JLabel lbl2 = new JLabel("야구게임");
		lbl2.setBounds(129, 10, 57, 15);
		contentPane.add(lbl2);
		
		JLabel lbl = new JLabel("숫자입력: ");
		lbl.setBounds(27, 38, 57, 15);
		contentPane.add(lbl);
		
		JButton btn = new JButton("Start");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myclick();
			}
		});
		btn.setBounds(27, 66, 190, 23);
		contentPane.add(btn);
		
		t2 = new JTextArea();
		t2.setBounds(27, 115, 190, 279);
		contentPane.add(t2);
	}
	public void myclick() {
		String[] arr = {"1","2","3","4","5","6","7","8","9"};
				
				for(int i=0; i<9999; i++) {			
					int r = rand.nextInt(9);
					String a = arr[1];
					String b = arr[0];
					arr[r]=a;
					arr[r]=b;
				}
			
				com = arr[0]+arr[1]+arr[2];
				System.out.println(com);
				
				String mine = t1.getText();
				String reset = "";
				
				int s = 0;
				String c1 = com.substring(0,1);
				String c2 = com.substring(1,2);
				String c3 = com.substring(2,3);
				
				String m1 = mine.substring(0,1);
				String m2 = mine.substring(1,2);
				String m3 = mine.substring(2,3);
				
				if(c1.equals(m1)){ s++; }
				if(c2.equals(m2)){ s++; }
				if(c3.equals(m3)){ s++; }
				
				int b = 0;
				if(c1.equals(m2) || c1.equals(m3)) { b++;}
				if(c2.equals(m1) || c2.equals(m3)) { b++;}
				if(c3.equals(m1) || c3.equals(m2)) { b++;}
				
				String str = mine+"\t"+s+"S "+b+"B"+"\n";
				String ostr = t2.getText();
				
				t2.setText(ostr+str);
				t1.setText(reset);
				if(s==3) {
					JOptionPane.showMessageDialog(null,mine+ ": 정답입니다!");
				}
				//System.out.println("s:"+ s +"b: "+b);
				//System.out.println(mine+"\t"+s+"S "+b+"B"+"\n");
		
				// 1~9 중 중복되지 않는 3개의 난수 생성
//		       Set<Integer> answerSet = new HashSet<>();
//		       while (answerSet.size() < 3) {
//		           int randomNum = (int) (Math.random() * 9) + 1;
//		           answerSet.add(randomNum);
//		       }
//		       
//		       // 사용자가 입력한 숫자를 Set으로 변환
//		       String inputStr = t1.getText();
//		       String[] inputArr = inputStr.split(" ");
//		       Set<Integer> inputSet = new HashSet<>();
//		       for (String numStr : inputArr) {
//		           inputSet.add(Integer.parseInt(numStr));
//		       }
//		       
//		       // 스트라이크와 볼 개수 계산
//		       int strikeCount = 0;
//		       int ballCount = 0;
//		       for (int answerNum : answerSet) {
//		           if (inputSet.contains(answerNum)) { // 사용자 입력에 숫자가 포함되어 있으면
//		               if (answerSet.contains(answerNum)) { // 숫자와 위치가 모두 일치하면 스트라이크
//		                   strikeCount++;
//		               } else { // 숫자는 일치하지만 위치가 다르면 볼
//		                   ballCount++;
//		               }
//		           }
//		       }
//		       
//		       // 결과 출력
//		       String resultStr = inputStr + " ==> " + strikeCount + "S " + ballCount + "B";
//		       t2.append(resultStr + "\n");
//		       
//		       // 정답인 경우
//		       if (strikeCount == 3) {
//		           t2.append(resultStr);
//		           t1.setEnabled(false); // 입력 필드 비활성화
//		       }
//		       
//		       // 입력 필드 초기화
//		       t1.setText("");
//		       t1.requestFocus();
	}
}
