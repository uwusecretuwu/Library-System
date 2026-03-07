package project_0;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonMaker {
	
	int r,g,b;
	
	public void buttonmaker(String name, JPanel panel, int width, int height, int...RGB) {
		JButton button = new JButton(name);
		button.setSize(width,height);
		r = RGB[0];
		g = RGB[1];
		g = RGB[2];
		button.setBackground(new Color(r,g,b));
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button) {
					System.out.println("you clicked a button");
					switch(button.getLabel()) {
					case "Borrowed Books":
						System.out.println("you are in a book window");
						break;
					case "Book Requests":
						System.out.println("you are in a book Request Window");
						break;
					}
					
				}
			}
			
		});
		

	}
}
