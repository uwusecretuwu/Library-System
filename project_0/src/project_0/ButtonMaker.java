package project_0;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ButtonMaker extends JButton {

	JButton button;
	int size = 75;
	String img;
	ButtonMaker(String img, Container cont) {
		this.setIcon(new ImageIcon(new ImageIcon(img, "borrowed_books").getImage()
				.getScaledInstance(75, 80, Image.SCALE_SMOOTH)));
		cont.add(this);
	}

}
