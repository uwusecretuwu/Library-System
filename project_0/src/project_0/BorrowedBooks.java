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
	JLabel title, listtitle, lblbooktitle, lblauthor, lblname, lblcontact, lblborrowed, lblborrowed2;
	JTextField txtbooktitle, txtauthor, txtname, txtcontact;
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
		btnadd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnadd.addActionListener(this);
		btnadd.setBackground(new Color(245, 235, 210));
		btnadd.setForeground(new Color(90, 30, 0));
		btnadd.setBorder(BorderFactory.createLineBorder(new Color(90, 30, 0), 1));
		btnadd.setPreferredSize(new Dimension(80, 30));

		center = new JPanel();
		center.setBackground(new Color(90, 30, 0));
		add(center, BorderLayout.CENTER);
		center.setLayout(new BorderLayout(10, 0));

		leftpanel = new JPanel();
		leftpanel.setLayout(new BorderLayout());
		leftpanel.setOpaque(true);
		leftpanel.setBackground(new Color(245, 235, 210));
		center.add(leftpanel, BorderLayout.CENTER);

		header = new JPanel(new BorderLayout());
		header.setBackground(new Color(245, 235, 210));
		leftpanel.add(header, BorderLayout.NORTH);

		listtitle = new JLabel("List of Borrowed Books");
		listtitle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		listtitle.setForeground(new Color(90, 30, 0));
		listtitle.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 0));
		header.add(listtitle, BorderLayout.WEST);

		btnremove = new JButton("REMOVE");
		btnremove.setFont(new Font("Times New Roman", Font.BOLD, 8));
		btnremove.addActionListener(this);
		btnremove.setBackground(new Color(90, 30, 0));
		btnremove.setForeground(new Color(245, 235, 210));
		btnremove.setPreferredSize(new Dimension(70, 30));

		JPanel forbutton = new JPanel();
		forbutton.setPreferredSize(new Dimension(80, 20));
		forbutton.setOpaque(false);
		forbutton.add(btnremove);
		header.add(forbutton, BorderLayout.EAST);

		String[] columntitlez = { "Book Title", "Author", "Name", "Contact No.", "Borrowed Date" };
		DefaultTableModel tbl = new DefaultTableModel(columntitlez, 0);

		table = new JTable(tbl);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		table.setBackground(new Color(245, 235, 210));
		table.setRowHeight(28);
		table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
		table.getTableHeader().setBackground(new Color(245, 235, 210));
		table.getTableHeader().setForeground(new Color(90, 30, 0));
		table.setSelectionBackground(c.saddle_brown);
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

		JPanel rightdown = new JPanel();
		rightpanel.add(rightdown, BorderLayout.SOUTH);
		rightdown.setBackground(new Color(245, 235, 210));

		JPanel righttop = new JPanel();
		rightpanel.add(righttop, BorderLayout.NORTH);
		righttop.setPreferredSize(new Dimension(50, 38));
		righttop.setBackground(new Color(245, 235, 210));
		righttop.setBorder(BorderFactory.createLineBorder(new Color(90, 30, 0), 2));

		JLabel addtitle = new JLabel("Add Borrowed Book");
		addtitle.setFont(new Font("Times New Roman", Font.ITALIC | Font.BOLD, 20));
		addtitle.setForeground(new Color(90, 30, 0));
		righttop.add(addtitle);

		rightcenter.setLayout(null);
		lblborrowed2 = new JLabel();
		lblborrowed2.setText(LocalDate.now().toString());
		lblborrowed2.setForeground(new Color(90, 30, 0));
		lblborrowed2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblborrowed2.setBounds(130, 10, 220, 30);
		lblbooktitle = new JLabel("BOOK TITLE");
		lblbooktitle.setBounds(5, 45, 250, 30);
		lblbooktitle.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblbooktitle.setForeground(new Color(90, 30, 0));
		txtbooktitle = new JTextField();
		txtbooktitle.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		txtbooktitle.setBackground(new Color(245, 235, 210));
		txtbooktitle.setBounds(5, 75, 220, 30);
		txtbooktitle.setBorder(BorderFactory.createLineBorder(new Color(90, 30, 0), 1));
		lblauthor = new JLabel("AUTHOR");
		lblauthor.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblauthor.setForeground(new Color(90, 30, 0));
		lblauthor.setBounds(5, 115, 250, 30);
		txtauthor = new JTextField();
		txtauthor.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		txtauthor.setBackground(new Color(245, 235, 210));
		txtauthor.setBounds(5, 145, 220, 30);
		txtauthor.setBorder(BorderFactory.createLineBorder(new Color(90, 30, 0), 1));
		lblname = new JLabel("NAME");
		lblname.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblname.setForeground(new Color(90, 30, 0));
		lblname.setBounds(5, 190, 250, 30);
		txtname = new JTextField();
		txtname.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		txtname.setBackground(new Color(245, 235, 210));
		txtname.setBounds(5, 225, 220, 30);
		txtname.setBorder(BorderFactory.createLineBorder(new Color(90, 30, 0), 1));
		lblcontact = new JLabel("CONTACT NUMBER");
		lblcontact.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblcontact.setForeground(new Color(90, 30, 0));
		lblcontact.setBounds(5, 270, 250, 30);
		txtcontact = new JTextField();
		txtcontact.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		txtcontact.setBackground(new Color(245, 235, 210));
		txtcontact.setBounds(5, 305, 220, 30);
		txtcontact.setBorder(BorderFactory.createLineBorder(new Color(90, 30, 0), 1));

		rightcenter.add(lblbooktitle);
		rightcenter.add(txtbooktitle);
		rightcenter.add(lblauthor);
		rightcenter.add(txtauthor);
		rightcenter.add(lblname);
		rightcenter.add(txtname);
		rightcenter.add(lblcontact);
		rightcenter.add(txtcontact);
		rightcenter.add(lblborrowed2);
		rightdown.add(btnadd);

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
			String titleText = txtbooktitle.getText();
			String author = txtauthor.getText();
			String name = txtname.getText();
			String contact = txtcontact.getText();
			String borrowed = lblborrowed2.getText();
			History.addBorrowedBooks(titleText, author, name, contact, borrowed);
			if (titleText.isEmpty() || author.isEmpty() || name.isEmpty() || contact.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Please fill in all fields.");
				return;
			}

			if(!AvailableBooks.checkAvailable(titleText)) {
				JOptionPane.showMessageDialog(this, "book does not exist");
				return;
			}
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[] { titleText, author, name, contact, borrowed });
			txtbooktitle.setText("");
			txtauthor.setText("");
			txtname.setText("");
			txtcontact.setText("");

		} else if (e.getSource() == btnremove) {
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			int selectedRow = table.getSelectedRow();

			if (selectedRow != -1) {
				model.removeRow(selectedRow);
			} else {
				JOptionPane.showMessageDialog(this, "Please select a row to remove.");
			}
		}
	}
}
