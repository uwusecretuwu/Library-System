package project_0;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorrowedBooks extends JFrame implements ActionListener {
	JButton btnadd;
	JLayeredPane data;
	JPanel gridpanel;

	public BorrowedBooks() {
		getContentPane().setBackground(new Color(90, 30, 0));
		setLayout(new BorderLayout());

		JPanel top = new JPanel(new BorderLayout());
		top.setBackground(new Color(90, 30, 0));

		JLabel title = new JLabel("BORROWED BOOKS");
		title.setFont(new Font("Times New Roman", Font.BOLD, 28));
		title.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
		title.setForeground(Color.WHITE);
		top.add(title, BorderLayout.WEST);
		add(top, BorderLayout.NORTH);

		btnadd = new JButton("ADD");
		btnadd.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnadd.addActionListener(this);

		JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 19, 16));
		right.setOpaque(false);
		right.add(btnadd);
		top.add(right, BorderLayout.EAST);

		JPanel center = new JPanel();
		center.setBackground(new Color(90, 30, 0));
		add(center, BorderLayout.CENTER);

		data = new JLayeredPane();
		data.setPreferredSize(new Dimension(550, 480));
		data.setBackground(new Color(245, 235, 210));
		data.setOpaque(true);
		center.add(data);

		gridpanel = new JPanel(new GridLayout(0, 2, 5, 5));
		gridpanel.setOpaque(false);
		gridpanel.setBounds(10, 10, 550, 420);
		data.add(gridpanel, JLayeredPane.DEFAULT_LAYER);
	}

	public void addBook(String title, String author, String name, String contactno, String borrowed) {
		JTextArea txtarea = new JTextArea("Book Title: " + title + "\n" + "Author: " + author + "\n" + "Name: " + name
				+ "\n" + "Contact Number: " + contactno + "\n" + "Borrowed: " + borrowed + "\n");

		txtarea.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		txtarea.setBackground(new Color(245, 235, 210));
		gridpanel.add(txtarea);
		gridpanel.revalidate();
		gridpanel.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnadd) {
			AddBorrowedBooks bb = new AddBorrowedBooks(this);
			bb.setVisible(true);
		}
	}
}
