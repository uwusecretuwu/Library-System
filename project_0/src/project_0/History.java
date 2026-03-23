package project_0;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

class History extends JPanel {

	private static Colors c = new Colors();

	private static JPanel historyPanel;
	
	static Font f = new Font("Times New Roman", Font.PLAIN, 16);

	History() {
		this.setBounds(20, 60, 1040, 650);
		this.setBackground(new Color(242, 236, 222));
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, c.ebony));
		this.setVisible(false);

		JPanel header = new JPanel();
		header.setLayout(new BorderLayout());
		header.setPreferredSize(new Dimension(0, 55));
		header.setBackground(c.ebony);

		JLabel title = new JLabel(" HISTORY LOG");
		title.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		title.setBackground(c.ebony);
		title.setForeground(c.almond_cream);

		header.add(title, BorderLayout.WEST);
		this.add(header, BorderLayout.NORTH);

		JPanel centerContainer = new JPanel();
		centerContainer.setLayout(new BoxLayout(centerContainer, BoxLayout.Y_AXIS));
		centerContainer.setBackground(new Color(242, 236, 222));

		historyPanel = new JPanel();
		historyPanel.setLayout(new BoxLayout(historyPanel, BoxLayout.Y_AXIS));
		historyPanel.setBackground(c.corn_silk);
		historyPanel.setBorder(
				BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 4, 4, 4, new Color(101, 67, 33)),
						BorderFactory.createEmptyBorder(8, 10, 8, 10)));
		
		JScrollPane scrollPane = new JScrollPane(historyPanel);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setBackground(new Color(242, 236, 222));

		this.add(scrollPane, BorderLayout.CENTER);

		//example data
		addBorrowedBooks("Harry Potter", "J.K. Rowling", "Jessika", "0992378617348", "1101-23-23");
		addAvailableBooks("fifty shades of grey", "E.L. James", "100", "1154-23-54");
		addRequestedBooks("Diary of the Wimpy kid", "Abril", "099236178238", "2987-19-29");
	}
	// creates a space between panels
	private static JPanel makeSpacer(Color bg) {
		JPanel spacer = new JPanel();
		spacer.setBackground(bg);
		spacer.setMaximumSize(new Dimension(Integer.MAX_VALUE, 8));
		return spacer;
	}

	public static void addBorrowedBooks(String book, String Author, String Borrower, String Contactno,
			String dateborrowed) {
		JPanel panel = new JPanel(null);
		panel.setBackground(c.saddle_brown);
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c.deep_brown, 5),
				BorderFactory.createLineBorder(panel.getBackground(), 10)));
		panel.setPreferredSize(new Dimension(Integer.MAX_VALUE, 90));
		panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 90));

		JLabel book_label = new JLabel(book);
		book_label.setBounds(15, 15, 800, 20);
		book_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JLabel author_label = new JLabel("by: " + Author + "");
		author_label.setBounds(25, 35, 800, 20);
		JLabel borrower_label = new JLabel("Borrower: " + Borrower + "");
		borrower_label.setBounds(20, 60, 800, 20);
		JLabel date_label = new JLabel(dateborrowed);
		date_label.setBounds(890, 10, 500, 20);
		JLabel contact_label = new JLabel("Contact No. " + Contactno + "");
		contact_label.setBounds(780, 60, 500, 20);
		
		
		book_label.setForeground(c.almond_cream);
		author_label.setFont(f);
		author_label.setForeground(c.almond_cream);
		borrower_label.setFont(f);
		borrower_label.setForeground(c.almond_cream);
		contact_label.setFont(f);
		contact_label.setForeground(c.almond_cream);
		date_label.setFont(f);
		date_label.setForeground(c.almond_cream);

		panel.add(book_label);
		panel.add(author_label);
		panel.add(borrower_label);
		panel.add(contact_label);
		panel.add(date_label);

		historyPanel.add(panel);
		historyPanel.add(makeSpacer(historyPanel.getBackground()));
		historyPanel.revalidate();
		historyPanel.repaint();
	}

	public static void addAvailableBooks(String book, String author, String quantity, String dateadded) {
		JPanel panel = new JPanel(null);
		panel.setBackground(c.dusty_olive);
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c.charcoal_brown, 5),
				BorderFactory.createLineBorder(panel.getBackground(), 10)));
		panel.setPreferredSize(new Dimension(Integer.MAX_VALUE, 90));
		panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 90));

		JLabel book_label = new JLabel(book);
		book_label.setBounds(15, 15, 800, 20);
		book_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		JLabel author_label = new JLabel("by: " + author + "");
		author_label.setBounds(25, 35, 800, 20);
		JLabel date_label = new JLabel(dateadded);
		date_label.setBounds(890, 10, 500, 20);
		JLabel quantity_label = new JLabel("copies: " + quantity);
		quantity_label.setBounds(25, 55, 800, 20);

		book_label.setForeground(c.almond_cream);
		author_label.setFont(f);
		author_label.setForeground(c.almond_cream);
		quantity_label.setFont(f);
		quantity_label.setForeground(c.almond_cream);
		date_label.setFont(f);
		date_label.setForeground(c.almond_cream);

		panel.add(book_label);
		panel.add(author_label);
		panel.add(quantity_label);
		panel.add(date_label);

		historyPanel.add(panel);
		historyPanel.add(makeSpacer(historyPanel.getBackground()));
		historyPanel.revalidate();
		historyPanel.repaint();
	}

	public static void addRequestedBooks(String book, String author, String contactno, String daterequested) {
		JPanel panel = new JPanel(null);
		panel.setBackground(c.camel);
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(c.clay_creek, 5),
				BorderFactory.createLineBorder(panel.getBackground(), 10)));
		panel.setPreferredSize(new Dimension(Integer.MAX_VALUE, 90));
		panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 90));

		JLabel book_label = new JLabel(book);
		book_label.setBounds(15, 15, 800, 20);
		book_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		book_label.setForeground(c.dark_walnut);
		JLabel author_label = new JLabel("by: " + author + "");
		author_label.setBounds(25, 35, 800, 20);
		JLabel date_label = new JLabel(daterequested);
		date_label.setBounds(890, 10, 500, 20);
		JLabel contact_label = new JLabel("Contact no: " + contactno);
		contact_label.setBounds(780, 55, 800, 20);

		author_label.setFont(f);
		author_label.setForeground(c.dark_walnut);
		contact_label.setFont(f);
		contact_label.setForeground(c.dark_walnut);
		date_label.setFont(f);
		date_label.setForeground(c.dark_walnut);

		panel.add(book_label);
		panel.add(author_label);
		panel.add(date_label);
		panel.add(contact_label);

		historyPanel.add(panel);
		historyPanel.add(makeSpacer(historyPanel.getBackground()));
		historyPanel.revalidate();
		historyPanel.repaint();
	}
}