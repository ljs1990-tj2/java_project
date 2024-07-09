package thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import day8.Circle;

class RunnableThread implements Runnable {
	private JLabel timerLabel; 
	
	public RunnableThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; 
	}
	
	@Override
	public void run() {
		int n=0; 
		while(true) { 
			timerLabel.setText(n + ""); 
			n++; 
			try {
				Thread.sleep(1000); 
			}
			catch(InterruptedException e) {
				return; 
			}
		}
	}
}

public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel); 
		
		RunnableThread runnable = new RunnableThread(timerLabel);
		Thread th = new Thread(runnable);

		setSize(300,170);
		setVisible(true);
		
		th.start(); 
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
		
		Circle c = new Circle();
	}
}