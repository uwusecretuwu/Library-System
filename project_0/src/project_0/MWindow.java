package project_0;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class MWindow extends JFrame implements ActionListener {

	// Declaration

	File files;

	JTextPane book_page_content = new JTextPane();

	AvailableBooks ab = new AvailableBooks();
	BorrowedBooks bb = new BorrowedBooks();
	RequestBooks rb = new RequestBooks();
	History h = new History();

	ButtonMaker available_books, borrowed_books, requested_books, history, notification_button;
	Colors c = new Colors();
	Images img = new Images();

	// to be deleted
	Color coffee_bean = new Color(127, 85, 57);
	Color camel = new Color(166, 138, 100);
	Color almond_cream = new Color(237, 224, 212);
	Color dusty_olive = new Color(101, 109, 74);
	Color ebony = new Color(65, 72, 51);

	JPanel header, header_left, header_buttons,book_mark;
	JLabel book_cover_title,searchbar_title;
	JPanel bb_panel, center_container, left_container, book_cover, book_page;
	JLayeredPane left_pane;
	JTextField searchbar;
	ImageIcon bell;
	JLabel search_info;
	JButton book_opener, searchbar_button;
	JScrollPane scroll;

	public MWindow() {
		// Main JFrame window
		this.setTitle("Alexandria");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // if we close the main window all other windows will close
		this.setLocationRelativeTo(null);
		this.setSize(new Dimension(460, 730));
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setAlwaysOnTop(true);
		this.getContentPane().setBackground(c.almond_cream);

		// Panels
		header = new JPanel(null);
		header.setPreferredSize(new Dimension(0, 100));
		header.setBackground(dusty_olive);
		header.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, ebony));

		searchbar = new JTextField();
		searchbar.setBounds(100, 40, 200, 35);
		searchbar.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		header.add(searchbar);

		searchbar_button = new JButton();
		searchbar_button.setBounds(350, 15, 20, 80);
		searchbar_button.addActionListener(this);
		header.add(searchbar_button);
		
		searchbar_title = new JLabel("search");
		searchbar_title.setBounds(150, 10, 100, 30);
		searchbar_title.setBackground(c.camel);
		searchbar_title.setOpaque(true);
		searchbar_title.setHorizontalAlignment(SwingConstants.CENTER);
		header.add(searchbar_title);

		search_info = new JLabel();
		search_info.setBounds(95, 75, 205, 20);
		search_info.setBackground(almond_cream);
		search_info.setOpaque(true);
		search_info.setHorizontalAlignment(SwingConstants.CENTER);
		header.add(search_info);

		// books in the header
		LabelMaker books = new LabelMaker("Images/requestedbooks.png");
		books.labelmaker(header, 0, 0, 30, 95, coffee_bean);
		books.labelmaker(header, 300, 10, 30, 85, c.camel);
		books.labelmaker(header, 330, 20, 20, 75, coffee_bean);
		books.labelmaker(header, 350, 15, 20, 80, ebony);
		books.labelmaker(header, 370, 10, 10, 85, coffee_bean);
		books.labelmaker(header, 380, 30, 15, 65, ebony);
		books.labelmaker(header, 395, 10, 15, 85, camel);
		books.labelmaker(header, 425, 10, 10, 85, coffee_bean);

		// all the buttons on the header
		//1080
		available_books = new ButtonMaker("Available Books ",header, 260, 50);
		available_books.setMnemonic(KeyEvent.VK_1);
		available_books.setLocation(450, 30);
		available_books.addActionListener(this);

		borrowed_books = new ButtonMaker("Borrowed Books",header, 260, 50);
		borrowed_books.setMnemonic(KeyEvent.VK_2);
		borrowed_books.setLocation(720, 30);
		borrowed_books.addActionListener(this);

		requested_books = new ButtonMaker("Requested Books",header, 260, 50);
		requested_books.setMnemonic(KeyEvent.VK_3);
		requested_books.setLocation(990, 30);
		requested_books.addActionListener(this);

		history = new ButtonMaker("History",header, 260, 50);
		history.setMnemonic(KeyEvent.VK_4);
		history.setLocation(1260, 30);
		history.addActionListener(this);

		left_container = new JPanel(null);
		left_container.setPreferredSize(new Dimension(450, 0));
		left_container.setBackground(coffee_bean);
		left_container.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 5, new Color(0, 0, 0)));

		left_pane = new JLayeredPane();
		left_pane.setLayout(null);
		left_pane.setBounds(0, 0, 450, 600);
		left_container.add(left_pane);

		book_cover = new JPanel(null);
		book_cover.setBounds(0, 0, 450, 600);
		book_cover.setBackground(new Color(153, 88, 42));
		book_cover.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 5, almond_cream));
		left_pane.add(book_cover);

		book_mark = new JPanel();
		book_mark.setBounds(400, 0, 20, 60);
		book_mark.setBackground(new Color(153, 39, 11));
		book_mark.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, new Color(67, 17, 5)));
		book_cover.add(book_mark);

		book_opener = new JButton("Open");
		book_opener.setBounds(300, 550, 100, 30);
		book_opener.addActionListener(this);
		book_cover.add(book_opener);

		book_cover_title = new JLabel("<html>Welcome back!<br/>...spread me</html>");
		book_cover_title.setFont(new Font("MV Boli", Font.PLAIN, 30));
		book_cover_title.setBounds(50, 100, 350, 200);
		book_cover_title.setBackground(new Color(0, 0, 0));
		book_cover_title.setHorizontalAlignment(JLabel.CENTER);
		book_cover_title.setVerticalAlignment(JLabel.CENTER);
		book_cover.add(book_cover_title, BorderLayout.CENTER);

		book_page = new JPanel(new BorderLayout());
		book_page.setBounds(0, 0, 445, 595);
		book_page.setBackground(almond_cream);
		book_page.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 05, c.almond_cream));
		left_pane.add(book_page);

		book_page_content.setBounds(0, 0, 445, 590);
		book_page_content.setEditable(false);
		book_page_content.setMargin(new Insets(10, 20, 10, 10));
		book_page_content.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 13));

		scroll = new JScrollPane(book_page_content);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.getViewport().setBackground(new Color(245, 235, 210));
		scroll.getVerticalScrollBar().setUnitIncrement(7);
		book_page.add(scroll);

		center_container = new JPanel(null);
		center_container.setPreferredSize(new Dimension(450, 450));
		center_container.setBackground(almond_cream);

		// Adding things to the Window
		center_container.add(ab);
		center_container.add(bb);
		center_container.add(rb);
		center_container.add(h);

		book_page_content.setVisible(false);

		this.add(left_container, BorderLayout.WEST);
		this.add(header, BorderLayout.NORTH);
		this.add(center_container, BorderLayout.CENTER);
		this.repaint();
		// Method Implementations
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(searchbar_button) && !searchbar.getText().isEmpty()) {
			String file = searchbar.getText().toLowerCase();
			files = new File("books/" + file + ".txt");
			String file_book_name = files.getName();
			System.out.println(file_book_name); // debug
			if (files.exists()) {
				System.out.println(files.exists()); // check
				book_cover_title.setText(searchbar.getText());
				search_info.setText("Book Found!");
				book_cover.setVisible(true);
			} else {
				search_info.setText("Book Not Found!");
				System.out.println("that book does not exist!");
			}

		} else if (e.getSource().equals(book_opener) && files.exists()) {
			try {
				Main.getFileName(files);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println("book is opened");
			book_page_content.setVisible(true);
			book_cover.setVisible(false);
		} else if (e.getSource().equals(available_books)) {
			System.out.println("available books");
			ab.setVisible(true);
			bb.setVisible(false);
			rb.setVisible(false);
			h.setVisible(false);
		} else if (e.getSource().equals(borrowed_books)) {
			System.out.println("borrowed books");
			bb.setVisible(true);
			ab.setVisible(false);
			rb.setVisible(false);
			h.setVisible(false);
		} else if (e.getSource().equals(requested_books)) {
			System.out.println("requested books");
			rb.setVisible(true);
			ab.setVisible(false);
			bb.setVisible(false);
			h.setVisible(false);
		} else if (e.getSource().equals(history)) {
			System.out.println("history");
			h.setVisible(true);
			bb.setVisible(false);
			rb.setVisible(false);
			ab.setVisible(false);
		}
	}
}
