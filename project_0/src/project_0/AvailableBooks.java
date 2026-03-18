package project_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AvailableBooks extends JPanel{

	// Sample book database
	Colors c = new Colors();
	
	String[] columns = { "books", "author", "quantity", "date added" };
	String[][] data = { {"Harry Potter", "J.K. Rowling", "9823734", "1101,11,54"},
			{"my lil pony", "Jess", "9823734", "1101,11,54"}};

	JPanel right_container, center_container, center_container_header;
	JLabel table_title;
	JFrame frame;
	
	JButton search_button, remove_button;
	JTextField searchbar;

	GridBagConstraints gbc = new GridBagConstraints();
	public AvailableBooks() {

		this.setBounds(20, 60, 1040, 650);
		this.setLayout(new BorderLayout());
		this.setVisible(false);
		this.setBorder(BorderFactory.createMatteBorder(0, 10, 10, 10, c.dark_walnut));

		JPanel header = new JPanel();
		header.setLayout(new BorderLayout());
		header.setPreferredSize(new Dimension(0, 70));
		header.setBackground(c.dark_walnut);
		
		JLabel title = new JLabel(" AVAILABLE BOOKS");
		title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		title.setForeground(c.almond_cream);

		//edit here for adding new books
		right_container = new JPanel();
		right_container.setLayout(null);
		right_container.setPreferredSize(new Dimension(250, 0));
		right_container.setBackground(c.coffee_bean);
		
		JPanel jessie = new JPanel();
		jessie.setBounds(0,0,100,100);
		jessie.setBackground(c.black);
		right_container.add(jessie);
		
		center_container = new JPanel();
		center_container.setLayout(new BorderLayout());
		center_container.setBackground(c.charcoal_brown);
		center_container.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 10, c.dark_walnut));

		center_container_header = new JPanel();
		center_container_header.setLayout(null);
		center_container_header.setPreferredSize(new Dimension(0, 40));
		center_container_header.setBackground(c.coffee_bean);
		center_container.add(center_container_header, BorderLayout.NORTH);

		searchbar = new JTextField();
		searchbar.setBounds(10,10,250,20);
		center_container_header.add(searchbar);

		search_button = new JButton("Search");
		search_button.setBounds(270, 10, 100,20);
		search_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchBooks();
			}
		});
		center_container_header.add(search_button, BorderLayout.EAST);
		
		remove_button = new JButton("remove");
		remove_button.setBounds(650, 10, 100,20);
		center_container_header.add(remove_button);

		JTable table = new JTable(data,columns);
		table.setPreferredScrollableViewportSize(new Dimension(100,100));
		table.setFillsViewportHeight(true);
		//edit here for style
		table.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		table.setBackground(new Color(245, 235, 210));
		table.setRowHeight(28);
		table.setSelectionBackground(c.coffee_bean);
		table.setSelectionForeground(c.almond_cream);
		JScrollPane scroll = new JScrollPane(table);
		center_container.add(scroll);

		this.add(right_container, BorderLayout.EAST);
		header.add(title, BorderLayout.WEST);
		this.add(center_container, BorderLayout.CENTER);
		this.add(header, BorderLayout.NORTH);

	}

	public void searchBooks() {
		String query = searchbar.getText().toLowerCase();
		boolean found = false;

		for (int i = 0; i < data.length; i++) {
			if(data[i][0].toLowerCase().equalsIgnoreCase(query)) {
				System.out.print("founds");
				found = true;
				//data[1][2].getChars(i, i, null, i);
				data[1][2] = "skibidi";
				//make it so that the scrollbar scrolls to the location of the book the user is searching for
			}
		}

		if (!found) {
			//please make JOptionPane isntead when no book is found
		}
	}

}
