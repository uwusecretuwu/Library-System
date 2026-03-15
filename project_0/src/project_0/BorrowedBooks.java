package project_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.time.LocalDate;

public class BorrowedBooks extends JPanel implements ActionListener {

	Colors c = new Colors();

	JPanel top, center, side1, side2, down, rightpanel, leftpanel, header;
	JLabel title, listtitle, lblbooktitle, lblauthor, lblname, lblcontact, lblborrowed;
	JTextField txtbooktitle, txtauthor, txtname, txtcontact, txtborrowed;
	JButton btnadd, btnremove;
	JTable table;

	public BorrowedBooks() {

		// the center container of the MWindow is null
		this.setBounds(20, 60, 1040, 650);
		this.setLayout(new BorderLayout());
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
		btnadd.setPreferredSize(new Dimension(200, 40));

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
		btnremove.setFont(new Font("Times New Roman", Font.BOLD, 10));
		btnremove.addActionListener(this);
		btnremove.setBackground(new Color(90, 30, 0));
		btnremove.setForeground(new Color(245, 235, 210));
		btnremove.setPreferredSize(new Dimension(80, 20));
		header.add(btnremove, BorderLayout.EAST);

		String[] columntitlez = { "Book Title", "Author", "Name", "Contact No.", "Borrowed Date" };
		DefaultTableModel tbl = new DefaultTableModel(columntitlez, 0);

		table = new JTable(tbl);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		table.setBackground(new Color(245, 235, 210));
		table.setRowHeight(28);
		table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
		table.getTableHeader().setBackground(new Color(245, 235, 210));
		table.getTableHeader().setForeground(new Color(90, 30, 0));
		table.setSelectionBackground(new Color(245, 235, 210));
		table.setSelectionForeground(c.dry_sage);
		table.setGridColor(new Color(90, 30, 0));
		table.setShowGrid(true);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.getViewport().setBackground(new Color(245, 235, 210));
		leftpanel.add(scrollPane, BorderLayout.CENTER);

		rightpanel = new JPanel(new FlowLayout());
		rightpanel.setOpaque(true);
		rightpanel.setBackground(new Color(245, 235, 210));
		rightpanel.setPreferredSize(new Dimension(250, 0));
		center.add(rightpanel, BorderLayout.EAST);
		rightpanel.setLayout(new BoxLayout(rightpanel, BoxLayout.Y_AXIS));
		rightpanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		lblbooktitle = new JLabel("BOOK TITLE");
		lblbooktitle.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblbooktitle.setForeground(new Color(90, 30, 0));
		lblbooktitle.setBounds(10, 10, 50, 30);
		lblauthor = new JLabel("AUTHOR");
		lblauthor.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblauthor.setForeground(new Color(90, 30, 0));
		lblauthor.setBounds(10, 10, 50, 30);
		lblname = new JLabel("NAME");
		lblname.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblname.setForeground(new Color(90, 30, 0));
		lblname.setBounds(10, 10, 50, 30);
		lblcontact = new JLabel("CONTACT NUMBER");
		lblcontact.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblcontact.setForeground(new Color(90, 30, 0));
		lblcontact.setBounds(10, 10, 50, 30);
		lblborrowed = new JLabel("BORROWED");
		lblborrowed.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblborrowed.setForeground(new Color(90, 30, 0));
		lblborrowed.setBounds(10, 10, 50, 30);
		txtbooktitle = new JTextField(10);
		txtbooktitle.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtauthor = new JTextField(10);
		txtauthor.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtname = new JTextField(10);
		txtname.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtcontact = new JTextField(10);
		txtcontact.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		txtborrowed = new JTextField(10);
		txtborrowed.setText(LocalDate.now().toString());
		txtborrowed.setEditable(false);

		rightpanel.add(lblbooktitle);
		rightpanel.add(txtbooktitle);
		rightpanel.add(Box.createVerticalStrut(10));
		rightpanel.add(lblauthor);
		rightpanel.add(txtauthor);
		rightpanel.add(Box.createVerticalStrut(10));
		rightpanel.add(lblname);
		rightpanel.add(txtname);
		rightpanel.add(Box.createVerticalStrut(10));
		rightpanel.add(lblcontact);
		rightpanel.add(txtcontact);
		rightpanel.add(Box.createVerticalStrut(10));
		rightpanel.add(lblborrowed);
		rightpanel.add(txtborrowed);
		rightpanel.add(Box.createVerticalStrut(20));

		btnadd.setAlignmentX(Component.LEFT_ALIGNMENT);
		rightpanel.add(btnadd);

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
			String borrowed = txtborrowed.getText();

			if (titleText.isEmpty() || author.isEmpty() || name.isEmpty() || contact.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please fill in all fields.");
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
				JOptionPane.showMessageDialog(null, "Please select a row to remove.");
			}
		}
	}
}
