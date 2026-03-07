package project_0;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MWindow extends JFrame implements ActionListener {

	// Declaration
	// Menu
	JMenuBar Menubar;
	JButton butt;
	JButton btn1, btn2, btn3;
	int counter = 1;
	JPanel header, ButtonHolders;
	JLayeredPane LPane;
	ImageIcon bell;

	public MWindow() {
		// Main JFrame window
		this.setTitle("Alexandria");
		this.setSize(500, 500);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // if we close the main window all other windows will close
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);

		// Panels
		LPane = new JLayeredPane();
		LPane.setBounds(350, 35, 100, 100);
		LPane.setVisible(false);

		header = new JPanel();
		header.setBounds(0, 0, 1920, 35);
		header.setBackground(new Color(170, 229, 118));
		header.setLayout(new FlowLayout(FlowLayout.RIGHT));

		ButtonHolders = new JPanel();
		ButtonHolders.setBounds(400, 200, 1000, 500);
		ButtonHolders.setBackground(new Color(200, 255, 118));
		ButtonHolders.setLayout(new FlowLayout(FlowLayout.LEFT));
		ButtonMaker btns = new ButtonMaker();

		
		btns.buttonmaker("Borrowed Books", ButtonHolders, 200, 200, 255, 255, 255);
		btns.buttonmaker("Book Requests", ButtonHolders, 200, 200, 255, 255, 255);

		butt = new JButton("notifications");
		butt.setBounds(350, 5, 125, 25);
		butt.addActionListener(this);

		// Adding things to the Window

		header.add(butt);
		this.add(ButtonHolders);
		this.add(LPane);
		this.add(header);

		// Method Implementations
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(butt)) {
			counter++;
			if (counter == 1) {
				LPane.setVisible(true);
			} else {
				counter = 0;
				LPane.setVisible(false);
			}
		}
	}

}
