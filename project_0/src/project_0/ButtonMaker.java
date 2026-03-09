package project_0;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ButtonMaker {

	int r, g, b;
	String img;
	ButtonMaker(String img) {
		this.img = img;
		
	}

	public void buttonmaker(String name, Container panel, Color color) {
		JButton button = new JButton();
		ImageIcon button_image = new ImageIcon(new ImageIcon(this.img, name).getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH));
		
		button.setLayout(new FlowLayout());
		button.setIcon(button_image);
		button.setBorder(BorderFactory.createLineBorder(color,5));
		button.setForeground(Color.GREEN); // This is a text color
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					System.out.println("you clicked a button");
					switch (name) {
					case "Borrowed Books":
						System.out.println("you are in a book window");
						break;
					case "Book Requests":
						System.out.println("you are in a book Request Window");
						break;
						default:
							System.out.println("there is no description");
							break;
					}

				}
			}

		});

	}
}
