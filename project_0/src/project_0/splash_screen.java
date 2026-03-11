package project_0;

import java.awt.Color;

import javax.swing.*;

public class splash_screen{
	
	boolean progressbarisdone = false;
	JFrame frame = new JFrame();
	JProgressBar PBar = new JProgressBar();

	public splash_screen() {
		PBar.setValue(0); // the value is converted to percentage from 0% to 100%
		PBar.setBounds(50,150,400,25);
		frame.add(PBar);

		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(3);
		frame.setSize(500,300);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(142, 217, 72));
				
		fill();
	}
	//Progress bar
	public void fill() {
		int counter = 0;
		while(counter<=100) {
			PBar.setValue(counter);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				counter+=1;
				if(counter == 100) {
					progressbarisdone = true;
					frame.dispose();
				}
		}
	}
	
}
