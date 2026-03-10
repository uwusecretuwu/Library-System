package project_0;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MWindow extends JFrame implements ActionListener {

	// Declaration
	int counter = 1;
	ButtonMaker borrowed_books,requested_books, available_books, history, notification_button;

	Color coffee_bean = new Color(127, 85, 57);
	Color camel = new Color(166, 138, 100);
	Color almond_cream = new Color(237, 224, 212);
	Color dusty_olive = new Color(101, 109, 74);
	Color ebony = new Color(65, 72, 51);

	JPanel header,header_left, header_buttons;
	JLabel book_cover_title;
	JPanel bb_panel;
	JTextField searchbar;
	ImageIcon bell;

	public MWindow() {
		// Main JFrame window
		this.setTitle("Alexandria");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // if we close the main window all other windows will close
		this.setLocationRelativeTo(null);
		this.setSize(new Dimension(460, 730));
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setAlwaysOnTop(true);
		this.getContentPane().setBackground(almond_cream);

		// Panels

		
		
		//header_buttons = new JPanel(grid_bag);
		header = new JPanel(null);
		header.setPreferredSize(new Dimension(0,100));
		header.setBackground(dusty_olive);
		header.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, ebony));
		header_left = new JPanel();
		header_left.setBounds(435,0,10,100);
		header_left.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 5, coffee_bean));
		
		LabelMaker books = new LabelMaker("Images/requestedbooks.png");
		books.labelmaker(header, 0, 0, 30, 95, coffee_bean);
		books.labelmaker(header, 300, 10, 30, 85, camel);
		books.labelmaker(header, 150, 10, 100, 30, camel);
		books.labelmaker(header, 95, 75, 205, 20, ebony);
		books.labelmaker(header, 330, 20, 20, 75, coffee_bean);
		books.labelmaker(header, 350, 15, 20, 80, ebony);
		books.labelmaker(header, 370, 10, 10, 85, coffee_bean);
		books.labelmaker(header, 380, 30, 15, 65, ebony);
		books.labelmaker(header, 395, 10, 15, 85, camel);
		books.labelmaker(header, 425, 10, 10, 85, coffee_bean);

		
		searchbar = new JTextField();
		searchbar.setBounds(100,40,200,40);
		searchbar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		
		
		// all the buttons on the header
		available_books = new ButtonMaker("Images/requestedbooks.png");
		available_books.x = 500;
		available_books.buttonmaker("Available Books", header, camel);
		borrowed_books.bb_panel = this.bb_panel;
		borrowed_books = new ButtonMaker("Images/book.png");
		borrowed_books.x = 600;
		borrowed_books.buttonmaker("Borrowed Books", header, camel);
		requested_books = new ButtonMaker("Images/requestedbooks.png");
		requested_books.x = 700;
		requested_books.buttonmaker("Requested Books", header, camel);
		history = new ButtonMaker("Images/requestedbooks.png");
		history.x = 800;
		history.buttonmaker("History", header, camel);
		notification_button = new ButtonMaker("Images/notification_bell.png");
		notification_button.x = 900;
		notification_button.buttonmaker("Notification Button", header, camel);

		JPanel left_container = new JPanel(null);
		left_container.setPreferredSize(new Dimension(450, 0));
		left_container.setBackground(coffee_bean);
		left_container.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 5, new Color(0,0,0)));
		
		JPanel book_cover = new JPanel(null);
		book_cover.setBounds(0,0,450,600);
		book_cover.setBackground(new Color(153, 88, 42));
		book_cover.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 5, almond_cream));
		
		book_cover_title = new JLabel("<html>Hello World!<br/>blahblahblah</html>");
		book_cover_title.setFont(new Font("MV Boli", Font.PLAIN, 30));
		book_cover_title.setBounds(50,100,350,200);
		book_cover_title.setBackground(new Color(0,0,0));
		book_cover_title.setHorizontalAlignment(JLabel.CENTER);
		book_cover_title.setVerticalAlignment(JLabel.CENTER);
		
		// Source - https://stackoverflow.com/a/2715279
		// Posted by coobird, modified by community. See post 'Timeline' for change history
		// Retrieved 2026-03-10, License - CC BY-SA 4.0
		

		JPanel center_container = new JPanel();
		center_container.setPreferredSize(new Dimension(450, 450));
		center_container.setBackground(almond_cream);

		// bb (borrowed books)
		header.add(searchbar);
		bb_panel = new JPanel(null);
		// bb_panel.setBorder(BorderFactory.createLineBorder(Color.black,5));
		JLabel text = new JLabel("Skibnidi");
		text.setSize(100, 100);
		bb_panel.setBackground(new Color(204, 149, 120));
		// bb_panel.set
		//bb_panel.setVisible(false);

		// Adding things to the Window
		//header.add(header_buttons);
		header.add(header_left);
		bb_panel.add(text);
		center_container.add(bb_panel);
		left_container.add(book_cover);
		book_cover.add(book_cover_title, BorderLayout.CENTER);
		
		this.add(left_container, BorderLayout.WEST);
		this.add(header, BorderLayout.NORTH);
		this.add(center_container, BorderLayout.CENTER);
		this.repaint();

		// Method Implementations
	}
	public void setBookTitle(String title, String author) {
		book_cover_title.setText("<html>"+title+"<br/>"+author+"</html>");
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
