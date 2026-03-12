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
		PBar.setForeground(new Color(237, 224, 212));
		PBar.setBorder(BorderFactory.createLineBorder(new Color(127, 85, 57)));
		frame.add(PBar);
		LabelMaker books = new LabelMaker();
		books.labelmaker(frame, 50, 48, 10, 100, new Color(127, 85, 57));
		books.labelmaker(frame, 60, 60, 10, 90, new Color(166, 138, 100));
		books.labelmaker(frame, 70, 55, 15, 95, new Color(127, 85, 57));
		books.labelmaker(frame, 85, 50, 10, 100, new Color(166, 138, 100));
		books.labelmaker(frame, 95, 50, 20, 100, new Color(127, 85, 57));
		books.labelmaker(frame, 115, 50, 20, 100, new Color(166, 138, 100));
		books.labelmaker(frame, 135, 50, 20, 100, new Color(127, 85, 57));
		books.labelmaker(frame, 155, 60, 15, 90, new Color(166, 138, 100));
		books.labelmaker(frame, 285, 60, 15, 90, new Color(166, 138, 100));
		books.labelmaker(frame, 300, 50, 20, 100, new Color(127, 85, 57));
		books.labelmaker(frame, 320, 70, 15, 80, new Color(166, 138, 100));
		
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(3);
		frame.setSize(500,300);
		frame.setAlwaysOnTop(true);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(65, 72, 51));
				
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
