package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	public NullContainerEx(){
		setTitle("NullContainerEx");
		Container c = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.setBackground(Color.lightGray);
		c.setLayout(null);
		
		JLabel label = new JLabel("Hello, Press Buttons!");
		label.setLocation(130, 50);
		label.setSize(200, 20);
		c.add(label);
		
		for(int i=1; i<=9; i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setLocation(i*15, i*15);
			btn.setSize(50, 20);
			c.add(btn);
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullContainerEx();
	}

}
