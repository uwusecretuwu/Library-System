package project_0;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ButtonMaker extends JButton {

	JButton button;
	int x,y,width,height;
	String img;
	ButtonMaker(JPanel cont, int width, int height) {
		this.width = width;
		this.height = height;
		this.setSize(width,height);
		cont.add(this);
	}

}
