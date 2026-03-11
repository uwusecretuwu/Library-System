package project_0;

import java.awt.*;

import javax.swing.*;

public class LabelMaker {
	String img;
	LabelMaker(String img) {
		this.img=img;
	}
	public void labelmaker(Container cont, int x, int y, int width, int height,Color color) {
		JPanel panel = new JPanel();
		panel.setBounds(x,y,width,height);
		panel.setBackground(color);
		//ImageIcon panel_img = new ImageIcon(new ImageIcon(this.img).getImage().getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH));
		cont.add(panel);
	}
}
