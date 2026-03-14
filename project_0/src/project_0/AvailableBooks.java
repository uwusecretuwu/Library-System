package project_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AvailableBooks extends JPanel{

    // Sample book database
	Colors c = new Colors();
    String[][] books = {};

    JFrame frame;
    JTextField search_field;
    JTextArea resultsArea;
    

    public AvailableBooks() {

    	this.setBounds(20,60,1040,650);
        this.setLayout(new BorderLayout());
        this.setVisible(false);
        this.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, c.dark_walnut));
        
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setPreferredSize(new Dimension(0,40));
        header.setBackground(c.dark_walnut);

        JLabel title = new JLabel("AVAILABLE BOOKS");
        title.setBounds(15,5,title.getText().length()*19, title.getFont().getSize()*2);
	    title.setFont(new Font("Times New Roman", Font.BOLD, 28));
	    title.setForeground(c.almond_cream);
        
        JPanel topPanel = new JPanel(new BorderLayout());

        search_field = new JTextField(20);
        search_field.setBounds(800,40,100,20);

        JButton searchButton = new JButton("Search");
        
        resultsArea = new JTextArea();
        resultsArea.setEditable(false);
        JScrollPane Scroll = new JScrollPane(resultsArea);

        resultsArea = new JTextArea(15, 35);
        resultsArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(resultsArea);

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchBooks();
            }
        });

        header.add(search_field);
        header.add(title);
        this.add(header, BorderLayout.NORTH);
        this.add(searchButton);
        this.add(scroll);

    }

    public void searchBooks() {

        String query = search_field.getText().toLowerCase();
        resultsArea.setText("");

        boolean found = false;

        for (String[] book : books) {
            if (book[0].toLowerCase().contains(query) ||
                book[1].toLowerCase().contains(query)) {

                resultsArea.append
                    (
                    "Title: " + book[0] +
                    "\nAuthor: " + book[1] +
                    "\nAvailable Copies: " + book[2] +
                    "\n------------------------\n"
                   );
                resultsArea.append(book[0] + " - " + book[1] + "\n");
                found = true;
            }
        }

        if (!found) {
            resultsArea.setText("No books found.");
        }
    }

}
