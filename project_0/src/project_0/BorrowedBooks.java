package project_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.time.LocalDate;

public class BorrowedBooks extends JPanel implements ActionListener {

	
	Colors c = new Colors();
	JPanel top;
	JPanel center;
	JPanel side1;
	JPanel side2;
	JPanel down;
	JPanel rightpanel;
	JPanel leftpanel;
	JPanel header;
	JLabel title, list_title, book_label, author_label, name_label, contact_label, lblborrowed, clock;
	JTextField book_field, author_field, name_field, contact_field;
	JButton btnadd, btnremove;
	JTable table;

	public BorrowedBooks() {

		this.setBounds(20, 60, 1040, 650);
		setLayout(new BorderLayout());
		top = new JPanel(new BorderLayout());
		add(top, BorderLayout.NORTH);
		top.setBackground(new Color(90, 30, 0));
		top.setPreferredSize(new Dimension(20, 70));

		title = new JLabel("BORROWED BOOKS");
		title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		title.setForeground(new Color(245, 235, 210));
		title.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		top.add(title, BorderLayout.WEST);

		btnadd = new JButton("ADD");
		btnadd.setBounds(15,380,200,30);
		btnadd.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnadd.addActionListener(this);
		btnadd.setBackground(new Color(90, 30, 0));
		btnadd.setForeground(new Color(245, 235, 210));
		btnadd.setBorder(BorderFactory.createLineBorder(new Color(90, 30, 0), 1));

		center = new JPanel();
		center.setBackground(new Color(90, 30, 0));
		add(center, BorderLayout.CENTER);
		center.setLayout(new BorderLayout(10, 0));

		leftpanel = new JPanel();
		leftpanel.setLayout(new BorderLayout());
		leftpanel.setOpaque(true);
		leftpanel.setBackground(new Color(245, 235, 210));
		center.add(leftpanel, BorderLayout.CENTER);

		header = new JPanel(null);
		header.setPreferredSize(new Dimension(0,40));
		header.setBackground(c.saddle_brown);
		leftpanel.add(header, BorderLayout.NORTH);

		list_title = new JLabel("List of Borrowed Books");
		list_title.setBounds(0,0,500,40);
		list_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		list_title.setForeground(c.almond_cream);
		list_title.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
		header.add(list_title);

		btnremove = new JButton("REMOVE");
		btnremove.setBounds(650, 10, 100, 20);
		btnremove.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnremove.addActionListener(this);
		btnremove.setBackground(c.deep_brown);
		btnremove.setForeground(c.almond_cream);

		header.add(btnremove);

		String[] columntitlez = { "Book Title", "Author", "Name", "Contact No.", "Borrowed Date" };
		DefaultTableModel tbl = new DefaultTableModel(columntitlez, 0);

		table = new JTable(tbl);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		table.setBackground(new Color(245, 235, 210));
		table.setRowHeight(28);
		table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
		table.getTableHeader().setBackground(c.deep_brown);
		table.getTableHeader().setForeground(c.almond_cream);
		table.setSelectionBackground(c.camel);
		table.setSelectionForeground(Color.BLACK);
		table.setDefaultEditor(Object.class, null);
		table.setGridColor(Color.gray);
		table.setShowGrid(true);

		JScrollPane scroll = new JScrollPane(table);
		scroll.getViewport().setBackground(new Color(245, 235, 210));
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		leftpanel.add(scroll, BorderLayout.CENTER);

		rightpanel = new JPanel(new BorderLayout());
		rightpanel.setOpaque(true);
		rightpanel.setBackground(new Color(245, 235, 210));
		rightpanel.setPreferredSize(new Dimension(250, 0));
		center.add(rightpanel, BorderLayout.EAST);
		rightpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		JPanel rightcenter = new JPanel();
		rightpanel.add(rightcenter, BorderLayout.CENTER);
		rightcenter.setPreferredSize(new Dimension(250, 300));
		rightcenter.setBackground(new Color(245, 235, 210));

		JPanel righttop = new JPanel();
		rightpanel.add(righttop, BorderLayout.NORTH);
		righttop.setPreferredSize(new Dimension(50, 38));
		righttop.setBackground(new Color(245, 235, 210));
		righttop.setBorder(BorderFactory.createLineBorder(c.dark_walnut, 2));

		JLabel addtitle = new JLabel("Add Borrowed Book");
		addtitle.setFont(new Font("Times New Roman", Font.ITALIC | Font.BOLD, 20));
		addtitle.setForeground(c.dark_walnut);
		righttop.add(addtitle);

		rightcenter.setLayout(null);
		clock = new JLabel();
		clock.setText(LocalDate.now().toString());
		clock.setForeground(new Color(90, 30, 0));
		clock.setFont(new Font("Times New Roman", Font.BOLD, 20));
		clock.setBounds(130, 10, 220, 30);
		book_label = new JLabel("BOOK TITLE");
		book_label.setBounds(5, 45, 250, 30);
		book_label.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		book_label.setForeground(new Color(90, 30, 0));
		book_field = new JTextField();
		book_field.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		book_field.setBackground(new Color(245, 235, 210));
		book_field.setBounds(5, 75, 220, 30);
		book_field.setBorder(BorderFactory.createLineBorder(c.dark_walnut, 1));
		author_label = new JLabel("AUTHOR");
		author_label.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		author_label.setForeground(new Color(90, 30, 0));
		author_label.setBounds(5, 115, 250, 30);
		author_field = new JTextField();
		author_field.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		author_field.setBackground(new Color(245, 235, 210));
		author_field.setBounds(5, 145, 220, 30);
		author_field.setBorder(BorderFactory.createLineBorder(c.dark_walnut, 1));
		name_label = new JLabel("NAME");
		name_label.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		name_label.setForeground(new Color(90, 30, 0));
		name_label.setBounds(5, 190, 250, 30);
		name_field = new JTextField();
		name_field.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		name_field.setBackground(new Color(245, 235, 210));
		name_field.setBounds(5, 225, 220, 30);
		name_field.setBorder(BorderFactory.createLineBorder(c.dark_walnut, 1));
		contact_label = new JLabel("CONTACT NUMBER");
		contact_label.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		contact_label.setForeground(new Color(90, 30, 0));
		contact_label.setBounds(5, 270, 250, 30);
		contact_field = new JTextField();
		contact_field.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		contact_field.setBackground(new Color(245, 235, 210));
		contact_field.setBounds(5, 305, 220, 30);
		contact_field.setBorder(BorderFactory.createLineBorder(c.dark_walnut, 1));

		rightcenter.add(book_label);
		rightcenter.add(book_field);
		rightcenter.add(author_label);
		rightcenter.add(author_field);
		rightcenter.add(name_label);
		rightcenter.add(name_field);
		rightcenter.add(contact_label);
		rightcenter.add(contact_field);
		rightcenter.add(clock);
		rightcenter.add(btnadd);

		side1 = new JPanel();
		side1.setBackground(new Color(90, 30, 10));
		add(side1, BorderLayout.EAST);
		side2 = new JPanel();
		side2.setBackground(new Color(90, 30, 10));
		add(side2, BorderLayout.WEST);
		down = new JPanel();
		down.setBackground(new Color(90, 30, 10));
		add(down, BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnadd) {
			String titleText = book_field.getText();
			String author = author_field.getText();
			String name = name_field.getText();
			String contact = contact_field.getText();
			String borrowed = clock.getText();
			if (titleText.isEmpty() || author.isEmpty() || name.isEmpty() || contact.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill in all fields.");
				return;
			}

			if(AvailableBooks.checkAvailable(titleText) == 0) {
				JOptionPane.showMessageDialog(this, "book copies have run out");
				return;
			} else if (AvailableBooks.checkAvailable(titleText) == -1) {
				JOptionPane.showMessageDialog(this, "book not found");
				return;
			}
			AvailableBooks.checkAvailable(titleText, false);
			History.addBorrowedBooks(titleText, author, name, contact, borrowed);
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] { titleText, author, name, contact, borrowed });
			book_field.setText("");
			author_field.setText("");
			name_field.setText("");
			contact_field.setText("");

		} else if (e.getSource() == btnremove) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			int selectedRow = table.getSelectedRow();
			if (selectedRow != -1) {
				AvailableBooks.checkAvailable(table.getValueAt(selectedRow, 0).toString(), true);
				model.removeRow(selectedRow);
			} else {
				JOptionPane.showMessageDialog(this, "Please select a row to remove.");
			}
		}
	}
}
