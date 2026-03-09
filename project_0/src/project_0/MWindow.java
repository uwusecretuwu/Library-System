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

	JPanel header,header_buttons;
	ImageIcon bell;

	public MWindow() {
		// Main JFrame window
		this.setTitle("Alexandria");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // if we close the main window all other windows will close
		this.setLocationRelativeTo(null);
		this.setSize(new Dimension(500, 500));
		this.setExtendedState(MAXIMIZED_BOTH);
		this.getContentPane().setBackground(almond_cream);

		// Panels
		GridBagConstraints grid_constraints = new GridBagConstraints();
		GridBagLayout grid_bag = new GridBagLayout();
		
		
		header = new JPanel(grid_bag);
		header.setSize(0, 200);
		header.setBackground(dusty_olive);
		header.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, ebony));
		header_buttons = new JPanel();
		

		ButtonMaker borrowed_books = new ButtonMaker("Images/book.png");
		borrowed_books.buttonmaker("Borrowed Books", header, camel);
		ButtonMaker requested_books = new ButtonMaker("Images/requestedbooks.png");
		requested_books.buttonmaker("Requested Books", header, camel);
		ButtonMaker available_books = new ButtonMaker("Images/requestedbooks.png");
		available_books.buttonmaker("Available Books", header, camel);
		ButtonMaker History = new ButtonMaker("Images/requestedbooks.png");
		requested_books.buttonmaker("History", header, camel);
		ButtonMaker notification_button = new ButtonMaker("Images/notification_bell.png");
		notification_button.buttonmaker("Notification Button", header, camel);

		JPanel left_container = new JPanel(null);
		left_container.setPreferredSize(new Dimension(450, 0));
		left_container.setBackground(coffee_bean);
		left_container.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 5, new Color(110, 50, 45)));
		
		JTextField current_book = new JTextField("Title");
		current_book.setBounds(120,20,200,50);
		current_book.setHorizontalAlignment(JTextField.CENTER);
		current_book.setPreferredSize(new Dimension(250,50));
		current_book.setLayout(new FlowLayout());
		current_book.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 30));
		current_book.setEditable(false);
		current_book.setCaretColor(dusty_olive);
		current_book.setBackground(dusty_olive);
		
		JPanel book_panel = new JPanel();
		book_panel.setBounds(20,100,410,500);
		book_panel.setBackground(almond_cream);
		
		JButton next_page = new JButton("->");
		next_page.setBounds(300,640,100, 50);
		JButton previous_page = new JButton("<-");
		previous_page.setBounds(50,640,100, 50);
		
		

		JPanel center_container = new JPanel(new BorderLayout());
		center_container.setPreferredSize(new Dimension(450, 450));
		center_container.setBackground(almond_cream);

		// bb (borrowed books)
		JPanel bb_panel = new JPanel();
		// bb_panel.setBorder(BorderFactory.createLineBorder(Color.black,5));
		bb_panel.setBackground(new Color(204, 149, 120));
		// bb_panel.set
		//bb_panel.setVisible(false);

		// Adding things to the Window
		center_container.add(bb_panel);
		left_container.add(next_page);
		left_container.add(previous_page);
		left_container.add(book_panel);
		left_container.add(current_book);

		this.add(header, BorderLayout.NORTH);
		this.add(center_container, BorderLayout.CENTER);
		this.add(left_container, BorderLayout.WEST);
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
