package project_0;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MWindow extends JFrame implements ActionListener {

	// Declaration
	int counter = 1;
	
	BorrowedBooks bb = new BorrowedBooks();
	
	JButton borrowed_books,requested_books, available_books, history, notification_button;

	Color coffee_bean = new Color(127, 85, 57);
	Color camel = new Color(166, 138, 100);
	Color almond_cream = new Color(237, 224, 212);
	Color dusty_olive = new Color(101, 109, 74);
	Color ebony = new Color(65, 72, 51);

	JPanel header,header_left, header_buttons;
	JLabel book_cover_title;
	JPanel bb_panel, center_container;
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
		
		//books in the header
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
		available_books = new JButton();
		available_books.setBounds(500, 10, 75, 80);
		available_books.setIcon(new ImageIcon(new ImageIcon("Images/requestedbooks.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
		available_books.setBorder(BorderFactory.createLineBorder(new Color(100,100,100),5));
		available_books.setForeground(Color.GREEN); // This is a text color
		header.add(available_books);
		available_books.addActionListener(this);
		
		borrowed_books = new JButton();
		borrowed_books.setBounds(700, 10, 75, 80);
		borrowed_books.setIcon(new ImageIcon(new ImageIcon("Images/requestedbooks.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
		borrowed_books.setBorder(BorderFactory.createLineBorder(new Color(100,100,100),5));
		borrowed_books.setForeground(Color.GREEN); // This is a text color
		header.add(borrowed_books);
		borrowed_books.addActionListener(this);
		
		requested_books = new JButton();
		requested_books.setBounds(950, 10, 75, 80);
		requested_books.setIcon(new ImageIcon(new ImageIcon("Images/requestedbooks.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
		requested_books.setBorder(BorderFactory.createLineBorder(new Color(100,100,100),5));
		requested_books.setForeground(Color.GREEN); // This is a text color
		header.add(requested_books);
		requested_books.addActionListener(this);
		
		history = new JButton();
		history.setBounds(1200, 10, 75, 80);
		history.setIcon(new ImageIcon(new ImageIcon("Images/requestedbooks.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
		history.setBorder(BorderFactory.createLineBorder(new Color(100,100,100),5));
		history.setForeground(Color.GREEN); // This is a text color
		header.add(history);
		history.addActionListener(this);
		
		notification_button = new JButton();
		notification_button.setBounds(1400, 10, 75, 80);
		notification_button.setIcon(new ImageIcon(new ImageIcon("Images/requestedbooks.png").getImage().getScaledInstance(75, 75, Image.SCALE_SMOOTH)));
		notification_button.setBorder(BorderFactory.createLineBorder(new Color(100,100,100),5));
		notification_button.setForeground(Color.GREEN); // This is a text color
		header.add(notification_button);
		notification_button.addActionListener(this);
		

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
		

		center_container = new JPanel();
		center_container.setLayout(null);
		center_container.setPreferredSize(new Dimension(450, 450));
		center_container.setBackground(almond_cream);

		// bb (borrowed books)
		// bb_panel.set

		// Adding things to the Window
		bb.setVisible(false);
		center_container.add(bb);
		header.add(header_left);
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
		if(e.getSource()!=borrowed_books) {
			System.out.println("available books on");
			bb.setVisible(false);
		}
		if(e.getSource()==borrowed_books) {
			System.out.println("borrowed Books on");
			bb.setVisible(true);
			bb.repaint();
		}		
	}
}
