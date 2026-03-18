package project_0;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class AvailableBooks extends JPanel implements ActionListener{

	// Sample book database
	Colors c = new Colors();

	JPanel right_container, center_container, center_container_header;
	JLabel table_title;
	JFrame frame;
	
	JButton search_button, remove_button;
	JTextField searchbar;
	
	ButtonMaker addbooks;
	JTable table;

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
		right_container.setBackground(c.almond_cream);
		
		JPanel right_header = new JPanel();

		right_header.setBounds(10,10,230,39);
		right_header.setBackground(c.almond_cream);
		right_container.add(right_header);
		right_header.setBorder(BorderFactory.createMatteBorder(2,2,2,2,c.charcoal_brown));
		right_header.setForeground(c.almond_cream);
		
		JTextField book_field = new JTextField();
		right_container.add(book_field);
		book_field.setBounds(12,150,230,35);
		book_field.setBackground(c.coffee_bean);
	    JLabel book_title = new JLabel("BOOK");
	    right_container.add(book_title);
	    book_title.setBounds(10,85,110,100);
	    book_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
	    
		
		
		JTextField author_field = new JTextField();
		right_container.add(author_field);
		author_field.setBounds(12,235,230,35);
		author_field.setBackground(c.coffee_bean);
		JLabel author_title = new JLabel("AUTHOR TITLE");
		right_container.add(author_title);
		author_title.setBounds(12,170,160,100);
		author_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		
		
		
		JTextField quantity_field = new JTextField();
		right_container.add(quantity_field);
		quantity_field.setBounds(12,320,230,35);
		quantity_field.setBackground(c.coffee_bean);
		JLabel quantity_title = new JLabel("QUANTITY");
		right_container.add(quantity_title);
		quantity_title.setBounds(12,255,150,100);
		quantity_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		
		
		
	
		
		JLabel right_headertitle = new JLabel("Add Available Books");
		right_header.add(right_headertitle);
		right_headertitle.setFont(new Font("Times New Roman", Font.ITALIC, 20));

		right_header.setLayout(new BorderLayout());
		right_header.setBounds(10,10,229,50);
		right_header.setBackground(c.coffee_bean);
		right_header.setBorder(BorderFactory.createMatteBorder(2,2,2,2, c.dry_sage));
		right_container.add(right_header);

		
		JLabel right_header_title = new JLabel("Add Available Books");
		right_header_title.setForeground(c.almond_cream);
		right_header_title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		right_header_title.setHorizontalAlignment(SwingConstants.CENTER);
		right_header.add(right_header_title);
		
		JLabel clock = new JLabel();
		clock.setText(LocalDate.now().toString());
		clock.setBounds(130,60,100,50);
		clock.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		right_container.add(clock);
		
		addbooks = new ButtonMaker("add book", right_container, 150,50);
		addbooks.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		addbooks.setLocation(50,500);
		addbooks.addActionListener(this);
		
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

		String[] table_header = { "Book Title", "Author", "Name", "Contact No.", "Borrowed Date" };
		DefaultTableModel tbl = new DefaultTableModel(table_header, 0);
		
		table = new JTable(tbl);
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
		 if (query.isEmpty()) {
             JOptionPane.showMessageDialog(this, 
             "Please enter a book name to search.", 
             "Error", 
             JOptionPane.ERROR_MESSAGE);
          return;
		 }
	

		
				//data[1][2].getChars(i, i, null, i);
				
				//make it so that the scrollbar scrolls to the location of the book the user is searching for

				
			
		


		if (!found) {
			//please make JOptionPane isntead when no book is found
			JOptionPane.showMessageDialog(this, 
                    "Book not found.", 
                    "Search Result", 
                    JOptionPane.WARNING_MESSAGE);
		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(addbooks)) {
			System.out.println("Button weork");
		}
		
	}


}
