package project_0;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class AvailableBooks extends JPanel implements ActionListener {

	static JTable table;

	Colors c = new Colors();
	// Sample book database
	Object[][] datas = { { "Harry Potter and the Philisopher's stone", "J.K. Rowling", "2", "2019-03-19" },
			{ "diary of the wimpy kid", "Jeff Kinney", "1", "2019-03-10" },
			{ "I Know This Much is True", "Wally Lamb", "4", "2020-4-7" },
			{ "Weight of Ink", "Rachel Kadish", "2", "2020-8-9" } };

	DefaultTableModel table_model;
	DefaultTableCellRenderer cellR;
	TableRowSorter row_sorter;

	JPanel right_container, center_container, center_container_header, right_header;
	JLabel table_title, right_header_title, book_title, author_title, quantity_title, clock;
	JTextField searchbar, book_field, author_field;
	JButton search_button, remove_button;
	ButtonMaker add_books;
	JSpinner quantity_field;

	public AvailableBooks() {

		this.setBounds(20, 60, 1040, 650);
		this.setLayout(new BorderLayout());
		this.setVisible(false);
		this.setBorder(BorderFactory.createMatteBorder(0, 10, 10, 10, c.charcoal_brown));

		JPanel header = new JPanel();
		header.setLayout(new BorderLayout());
		header.setPreferredSize(new Dimension(0, 70));
		header.setBackground(c.charcoal_brown);

		JLabel title = new JLabel(" AVAILABLE BOOKS");
		title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		title.setForeground(c.almond_cream);

		right_container = new JPanel(null);
		right_container.setPreferredSize(new Dimension(250, 0));
		right_container.setBackground(c.almond_cream);

		right_header = new JPanel();
		right_header.setBounds(10, 10, 230, 39);
		right_header.setBackground(c.almond_cream);
		right_header.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, c.charcoal_brown));
		right_header.setForeground(c.almond_cream);
		right_container.add(right_header);

		right_header_title = new JLabel("Add Available Book");
		right_header_title.setForeground(c.charcoal_brown);
		right_header_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		right_header_title.setHorizontalAlignment(SwingConstants.CENTER);
		right_header.add(right_header_title);

		book_field = new JTextField();
		book_field.setBounds(12, 150, 230, 35);
		book_field.setBackground(c.almond_cream);
		book_field.setForeground(c.charcoal_brown);
		book_field.setBorder(BorderFactory.createLineBorder(c.charcoal_brown, 1));
		// book_field.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		right_container.add(book_field);
		book_title = new JLabel("BOOK TITLE");
		book_title.setBounds(10, 85, 110, 100);
		book_title.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		book_title.setForeground(c.charcoal_brown);
		right_container.add(book_title);

		author_field = new JTextField();
		author_field.setBounds(12, 235, 230, 35);
		author_field.setBackground(c.almond_cream);
		author_field.setBorder(BorderFactory.createLineBorder(c.charcoal_brown, 1));
		right_container.add(author_field);
		author_title = new JLabel("AUTHOR");
		author_title.setBounds(12, 170, 160, 100);
		author_title.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		author_title.setForeground(c.charcoal_brown);
		right_container.add(author_title);

		quantity_field = new JSpinner();
		quantity_field.setBounds(12, 320, 230, 35);
		quantity_field.setBackground(c.almond_cream);
		quantity_field.setForeground(c.charcoal_brown);
		quantity_field.setBorder(BorderFactory.createLineBorder(c.charcoal_brown, 1));
		right_container.add(quantity_field);
		quantity_title = new JLabel("QUANTITY");
		quantity_title.setBounds(12, 255, 150, 100);
		quantity_title.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		quantity_title.setForeground(c.charcoal_brown);
		right_container.add(quantity_title);

		clock = new JLabel();
		clock.setText(LocalDate.now().toString());
		clock.setBounds(140, 50, 100, 50);
		clock.setFont(new Font("Times New Roman", Font.BOLD, 20));
		clock.setForeground(c.charcoal_brown);
		right_container.add(clock);

		add_books = new ButtonMaker("ADD",c.charcoal_brown, c.almond_cream, right_container, 200, 30);
		add_books.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add_books.setLocation(25, 400);
		add_books.addActionListener(this);

		center_container = new JPanel();
		center_container.setLayout(new BorderLayout());
		center_container.setBackground(c.charcoal_brown);
		center_container.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 10, c.charcoal_brown));

		center_container_header = new JPanel();
		center_container_header.setLayout(null);
		center_container_header.setPreferredSize(new Dimension(0, 40));
		center_container_header.setBackground(c.dusty_olive);
		center_container.add(center_container_header, BorderLayout.NORTH);

		searchbar = new JTextField();
		searchbar.setBounds(10, 10, 250, 20);
		center_container_header.add(searchbar);

		search_button = new JButton("SEARCH");
		search_button.setBounds(270, 10, 100, 20);
		search_button.setFont(new Font("Times New Roman", Font.BOLD, 12));
		search_button.addActionListener(this);
		search_button.setBackground(c.charcoal_brown);
		search_button.setForeground(c.almond_cream);
		center_container_header.add(search_button, BorderLayout.EAST);

		remove_button = new JButton("REMOVE");
		remove_button.setBounds(650, 10, 100, 20);
		remove_button.setFont(new Font("Times New Roman", Font.BOLD, 12));
		remove_button.addActionListener(this);
		remove_button.setBackground(c.charcoal_brown);
		remove_button.setForeground(c.almond_cream);
		center_container_header.add(remove_button);

		String[] table_header = { "Book Title", "Author", "Quantity", "Borrowed Date" };
		table_model = new DefaultTableModel(datas, table_header);
		row_sorter = new TableRowSorter(table_model);
		cellR = new DefaultTableCellRenderer();
		cellR.setHorizontalAlignment(JLabel.CENTER);

		table = new JTable(table_model);
		table.setPreferredScrollableViewportSize(new Dimension(100, 100));
		table.setFillsViewportHeight(true);
		table.setRowSorter(row_sorter);
		// edit here for style
		table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
		table.getTableHeader().setBackground(c.charcoal_brown);
		table.getTableHeader().setForeground(c.almond_cream);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		table.setBackground(new Color(245, 235, 210));
		table.setRowHeight(28);
		table.setSelectionBackground(c.dusty_olive);
		table.setSelectionForeground(c.almond_cream);
		JScrollPane scroll = new JScrollPane(table);
		center_container.add(scroll);
		this.add(right_container, BorderLayout.EAST);
		header.add(title, BorderLayout.WEST);
		this.add(center_container, BorderLayout.CENTER);
		this.add(header, BorderLayout.NORTH);

		searchbar.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				changed();
			}

			public void removeUpdate(DocumentEvent e) {
				changed();
			}

			public void insertUpdate(DocumentEvent e) {
				changed();
			}

			public void changed() {
				if (searchbar.getText().equals("")) {
					System.out.println("changed");
					row_sorter.setRowFilter(new customTableSorter(searchbar.getText()));
				} else {
				}
			}
		});
	}

	public static int checkAvailable(String book) {
		
		// 0 = check only if book is available
		// 1 = find the book and borrow
		// 2 = find the book and return it
		for (int i = 0; i < table.getRowCount(); i++) {
			// found the book
			if (book.equalsIgnoreCase(table.getValueAt(i, 0).toString().toLowerCase())) {
				int quantity = Integer.parseInt(table.getValueAt(i, 2).toString().toLowerCase());
				if(quantity == 0) {
					return quantity;
				}
				return quantity;
			}
		}
		// did not find the book
		return -1;
	}
public static int checkAvailable(String book, boolean add) {
		for (int i = 0; i < table.getRowCount(); i++) {
			// found the book
			if (book.equalsIgnoreCase(table.getValueAt(i, 0).toString().toLowerCase())) {
				int quantity = Integer.parseInt(table.getValueAt(i, 2).toString().toLowerCase());
				if(add == true) {
					table.setValueAt(quantity + 1,i, 2);
					return quantity;
				}
				table.setValueAt(quantity - 1,i, 2);
			}
		}
		// did not find the book
		return -1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(add_books)) {
			System.out.println("Button weork");
			if (book_field.getText().isEmpty() || author_field.getText().isEmpty()
					|| quantity_field.getValue().toString().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill in all fields.");
				return;
			}
			table_model.addRow(new Object[] { book_field.getText(), author_field.getText(), quantity_field.getValue(),
					clock.getText() });
			table.getColumnModel().getColumn(table.getColumnCount() - 1).setCellRenderer(cellR);

			History.addAvailableBooks(book_field.getText(), author_field.getText(), quantity_field.getValue().toString(),
					clock.getText());

			book_field.setText("");
			author_field.setText("");
			quantity_field.setValue(0);
		} else if (e.getSource().equals(remove_button)) {
			if (table.getSelectedRow() == -1) {
				JOptionPane.showMessageDialog(this, "please select a row to remove");
				return;
			}
			table_model.removeRow(table.getSelectedRow());
		} else if (e.getSource().equals(search_button)) {
			if (searchbar.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please enter a book name to search.", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;
			}
			row_sorter.setRowFilter(new customTableSorter(searchbar.getText().toLowerCase()));
		}
	}
}

