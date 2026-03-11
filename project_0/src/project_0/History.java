package project_0;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;
class History extends JPanel {
    // JPanel history = new JPanel();
    String Title;
    History() {
        this.setSize(100,100);
        this.setBackground(Color.magenta);
        setLayout(new BorderLayout());
    }
    public void addpanel() {
        top = new JPanel(new BorderLayout);
        top.setBackground(new Color(90, 30, 0));
        JLabel title = new JLabel("HISTORY");
        title.setFont("Times New Roman", Font.BOLD, 28)):
        title.setForeground(Color.WHITE);
        top.add(title, BorderLayout.WEST);
        add(top, BorderLayout.NORTH);

        //sub panels
        borrowedPanel= createSubPanel("BORROWED BOOKS");
        requestPanel= createSubPanel("REQUESTED BOOKS");
        availablePanel= createSubPanel("AVAILABLE BOOKS");
        
        
    }
    public void addhistory(String book, String author, String borrower, String contact_number ) {
        String title = "Borrowed Books";
        JLabel sub_panel_title = new JLabel();
        sub_panel_title.setText(title);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Borrowed Books");
        label.setForeground(Color.red);
        this.add(borrowedPanel);
        
    }
    //ab
    public void addhistory(String book, String author, int quantity) {
        String title = "Available Books";
        JLabel sub_panel_title = new JLabel();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Available Books");
        label.setForeground(Color.red);
        this.add(availablePanel);
    
    }
    public void addhistory(String book, String author, String contact_number) {
        String title = "Requested Books";
        JLabel sub_panel_title = new JLabel();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Requested Books");
        label.setForeground(Color.red);
        this.add(requestedPanel);
        
    }
    
}


