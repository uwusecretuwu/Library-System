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

    Colors c = new Colors();

    private static JPanel borrowedPanel;
    private static JPanel availablePanel;
    private static JPanel requestedPanel;

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

        // center container
        JPanel centerContainer = new JPanel();
        centerContainer.setLayout(new BoxLayout(centerContainer, BoxLayout.Y_AXIS));
        centerContainer.setBackground(new Color(242, 236, 222));

        // ---- Borrowed Books section ----
        centerContainer.add(makeSectionHeader("  BORROWED BOOKS", new Color(101, 67, 33)));
        borrowedPanel = new JPanel();
        borrowedPanel.setLayout(new BoxLayout(borrowedPanel, BoxLayout.Y_AXIS));
        borrowedPanel.setBackground(new Color(255, 248, 235));
        borrowedPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 4, 4, 4, new Color(101, 67, 33)),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)));
        centerContainer.add(borrowedPanel);

        // ---- Available Books section ----
        centerContainer.add(makeSectionHeader("  AVAILABLE BOOKS", new Color(34, 85, 34)));
        availablePanel = new JPanel();
        availablePanel.setLayout(new BoxLayout(availablePanel, BoxLayout.Y_AXIS));
        availablePanel.setBackground(new Color(235, 255, 235));
        availablePanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 4, 4, 4, new Color(34, 85, 34)),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)));
        centerContainer.add(availablePanel);

        // ---- Requested Books section ----
        centerContainer.add(makeSectionHeader("  REQUESTED BOOKS", new Color(120, 60, 0)));
        requestedPanel = new JPanel();
        requestedPanel.setLayout(new BoxLayout(requestedPanel, BoxLayout.Y_AXIS));
        requestedPanel.setBackground(new Color(255, 240, 220));
        requestedPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 4, 4, 4, new Color(120, 60, 0)),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)));
        centerContainer.add(requestedPanel);

        JScrollPane scrollPane = new JScrollPane(centerContainer);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        scrollPane.getViewport().setBackground(new Color(242, 236, 222));

        this.add(scrollPane, BorderLayout.CENTER);
        
        addBorrowedBooks("Harry Potter", "J.K. Rowling", "Jessika", "0992378617348", "11/23/4323");
        addAvailableBooks("fifty shades of grey", "E.L. James","100", "11/23/54");
        addRequestedBooks("Diary of the Wimpy kid", "Abril", "099236178238", "29-19-29");
    }

    private JPanel makeSectionHeader(String text, Color bgColor) {
        JPanel bar = new JPanel(new BorderLayout());
        bar.setBackground(bgColor);
        bar.setMaximumSize(new Dimension(Integer.MAX_VALUE, 36));
        bar.setBorder(BorderFactory.createEmptyBorder(5, 12, 5, 12));
        JLabel lbl = new JLabel(text);
        lbl.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lbl.setForeground(Color.WHITE);
        bar.add(lbl, BorderLayout.WEST);
        return bar;
    }

    private static JPanel makeSpacer(Color bg) {
        JPanel spacer = new JPanel();
        spacer.setBackground(bg);
        spacer.setMaximumSize(new Dimension(Integer.MAX_VALUE, 8));
        return spacer;
    }

    public static void addBorrowedBooks(String book, String Author, String Borrower, String Contactno, String dateborrowed) {
        String title = "Borrowed Books";

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(255, 248, 235));
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 130, 70), 1),
                BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 115));

        JLabel book1     = new JLabel("Book Title:"    + book         + "");
        JLabel author1   = new JLabel("Author:"        + Author       + "");
        JLabel borrower1 = new JLabel("Borrower:"      + Borrower     + "");
        JLabel contact1  = new JLabel("Contact No."   + Contactno    + "");
        JLabel date1     = new JLabel("Date Borrowed:" + dateborrowed + "");

        Font f = new Font("Times New Roman", Font.PLAIN, 14);
        Color fg = new Color(40, 30, 20);

        book1.setFont(f);     book1.setForeground(fg);
        author1.setFont(f);   author1.setForeground(fg);
        borrower1.setFont(f); borrower1.setForeground(fg);
        contact1.setFont(f);  contact1.setForeground(fg);
        date1.setFont(f);     date1.setForeground(fg);

        panel.add(book1);
        panel.add(author1);
        panel.add(borrower1);
        panel.add(contact1);
        panel.add(date1);

        borrowedPanel.add(panel);
        borrowedPanel.add(makeSpacer(new Color(255, 248, 235)));
        borrowedPanel.revalidate();
        borrowedPanel.repaint();
    }

    public static void addAvailableBooks(String book, String Author, String quantity, String dateadded) {
        String title = "Available Books";

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(235, 255, 235));
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(60, 140, 60), 1),
                BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));

        JLabel book2    = new JLabel("Book Title:"  + book + "");
        JLabel author2  = new JLabel("Author:"      + Author    + "");
        JLabel book_quantity = new JLabel("Quantity :" + quantity + "");
        JLabel dateaddedlabel = new JLabel("date added :" + dateadded + "");

        Font f = new Font("Times New Roman", Font.PLAIN, 14);
        Color fg = new Color(40, 30, 20);

        book2.setFont(f);    book2.setForeground(fg);
        author2.setFont(f);  author2.setForeground(fg);
        book_quantity.setFont(f); book_quantity.setForeground(fg);
        dateaddedlabel.setFont(f); dateaddedlabel.setForeground(fg);

        panel.add(book2);
        panel.add(author2);
        panel.add(book_quantity);
        panel.add(dateaddedlabel);

        availablePanel.add(panel);
        availablePanel.add(makeSpacer(new Color(235, 255, 235)));
        availablePanel.revalidate();
        availablePanel.repaint();
    }

    public static void addRequestedBooks(String book, String Author, String Contactno, String daterequested) {
        String title = "Requested Books";

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(255, 240, 220));
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 90, 0), 1),
                BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));

        JLabel book1    = new JLabel("Book Title:"  + book      + "");
        JLabel author1  = new JLabel("Author:"      + Author    + "");
        JLabel contact1 = new JLabel("Contact No.:" + Contactno + "");
        JLabel daterequestedlabel = new JLabel("Date Requested: " + daterequested + "");

        Font f = new Font("Times New Roman", Font.PLAIN, 14);
        Color fg = new Color(40, 30, 20);

        book1.setFont(f);    book1.setForeground(fg);
        author1.setFont(f);  author1.setForeground(fg);
        contact1.setFont(f); contact1.setForeground(fg);
        daterequestedlabel.setFont(f); daterequestedlabel.setForeground(fg);

        panel.add(book1);
        panel.add(author1);
        panel.add(contact1);
        panel.add(daterequestedlabel);

        requestedPanel.add(panel);
        requestedPanel.add(makeSpacer(new Color(255, 240, 220)));
        requestedPanel.revalidate();
        requestedPanel.repaint();
    }
}

