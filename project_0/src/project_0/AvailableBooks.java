package project_0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class AvailableBooks extends JPanel{

    // Sample book database
    String[][] books = {
            {"To Kill a Mockingbird", "Harper Lee",          "4"},
            {"1984",                  "George Orwell",       "4"},
            {"Pride and Prejudice",   "Jane Austen",         "2"},
            {"The Great Gatsby",      "F. Scott Fitzgerald", "3"},
            {"Moby Dick",             "Herman Melville",     "5"},
            {"War and Peace",         "Leo Tolstoy",         "4"},
            {"Skibidi UwU",           "J.R.R. Tolkien",      "6"}
    };

    JFrame frame;
    JTextField searchField;
    JTextArea resultsArea;
    

    public AvailableBooks() {

    	this.setBounds(20,60,1040,650);
        this.setLayout(new FlowLayout());

        JLabel title = new JLabel("Library Book Search");
        title.setFont(new Font("Arial", Font.BOLD, 18));
        
        JPanel topPanel = new JPanel(new BorderLayout());

        searchField = new JTextField(20);

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

        this.add(title);
        this.add(searchField);
        this.add(searchButton);
        this.add(scroll);

    }

    public void searchBooks() {

        String query = searchField.getText().toLowerCase();
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
