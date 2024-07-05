package gui;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(){
		setTitle("첫번째 GUI 프로그램");
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
