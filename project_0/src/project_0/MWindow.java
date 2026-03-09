package project_0;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MWindow extends JFrame implements ActionListener {

	// Declaration
	
	int counter = 1;
	
	Color coffee_bean = new Color(127, 85, 57);
	Color camel = new Color(166, 138, 100);
	Color almond_cream = new Color(237, 224, 212);
	Color dusty_olive = new Color(101, 109, 74);
	Color ebony = new Color(65, 72, 51);
	
	JButton notification_button;
	
	JPanel header;
	ImageIcon bell;


	public MWindow() {
		// Main JFrame window
		this.setTitle("Alexandria");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // if we close the main window all other windows will close
		this.setLocationRelativeTo(null);
		this.setSize(new Dimension(500,500));
		this.setExtendedState(MAXIMIZED_BOTH);
		this.getContentPane().setBackground(almond_cream);
		
		// Panels
		header = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		header.setSize(0, 200);
		header.setBackground(ebony);
		
		JPanel left = new JPanel();
		left.setPreferredSize(new Dimension(450,0));
		left.setBackground(new Color(102, 24, 7));
		
		ButtonMaker notification_button = new ButtonMaker("Images/notification_bell.png");
		notification_button.buttonmaker("Notification Button", header, camel);
		ButtonMaker borrowed_books = new ButtonMaker("Images/book.png");
		borrowed_books.buttonmaker("Borrowed Books", header, camel);
		ButtonMaker requested_books = new ButtonMaker("Images/requestedbooks.png");
		requested_books.buttonmaker("Request Books", header, camel);
		ButtonMaker History = new ButtonMaker("Images/requestedbooks.png");
		requested_books.buttonmaker("History", header, camel);
		
		

		// Adding things to the Window

		this.add(header,BorderLayout.NORTH);
		this.add(left, BorderLayout.WEST);
		this.repaint();

		// Method Implementations
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(notification_button)) {
			counter++;
			if (counter == 1) {
				System.out.println("work");

			} else {
				System.out.print("not");
				counter = 0;

			}
		}
	}

}
