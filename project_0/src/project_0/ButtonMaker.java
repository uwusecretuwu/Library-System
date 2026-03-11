package project_0;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ButtonMaker extends JButton{

	JButton button;
	int r, g, b;
	int size = 75;
	int x,y;
	String img;
	ButtonMaker(String img) {
		this.img = img;
	}

	public void buttonmaker(String name, Container cont, Color color) {
		button = new JButton();
		ImageIcon button_image = new ImageIcon(new ImageIcon(this.img, name).getImage().getScaledInstance(this.size, this.size, Image.SCALE_SMOOTH));

		button.setBounds(x, 10, 75, 80);
		button.setIcon(button_image);
		button.setBorder(BorderFactory.createLineBorder(color,5));
		button.setForeground(Color.GREEN); // This is a text color
		cont.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					System.out.println("you clicked a button");
					switch (name) {
					case "Borrowed Books":
						System.out.println(name);
						break;
					case "Requested Books":
						System.out.println(name);
						break;
						default:
							System.out.println(" Name not Found");
							break;
					}
				}
			}
		}); 

	}
}
