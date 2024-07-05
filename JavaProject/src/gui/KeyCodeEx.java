package gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel(); // 빈 레이블 컴포넌트 생성
	
	public KeyCodeEx() {
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.setLayout(null);
		la.setLocation(0, 40);
		la.setSize(120, 15);
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"키가 입력되었음");
			if(e.getKeyChar() == '%') {
				contentPane.setBackground(Color.YELLOW);
			} else if(e.getKeyCode() == KeyEvent.VK_F1) { 
				contentPane.setBackground(Color.GREEN);
			} else if(e.getKeyCode() == KeyEvent.VK_CONTROL) { 
				la.setOpaque(true);
				la.setBackground(Color.CYAN);
			} 
		}
	}
	
	public static void main(String [] args) {
		new KeyCodeEx();
	}
}