import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class LibrarySearchGUI {

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
    

    public LibrarySearchGUI() {

        frame = new JFrame("Library Search System");
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);

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

        frame.add(title);
        frame.add(searchField);
        frame.add(searchButton);
        frame.add(scroll);

        frame.setVisible(true);
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

    public static void main(String[] args) {
        new LibrarySearchGUI();
    }
}
