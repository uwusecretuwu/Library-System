        
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
class History extends JPanel {
    // JPanel history = new JPanel();
    String Title;
    History() {
        this.setSize(100,100);
        this.setBackground(Color.white);
        setLayout(new BorderLayout());
    }
    public void addpanel() {
    	
    	//If there is error try importing or check the spelling
    	
        //top = new JPanel(new BorderLayout);
        //top.setBackground(new Color(90, 30, 0));
        //JLabel title = new JLabel("HISTORY");
        //title.setFont("Times New Roman", Font.BOLD, 28)):
        //title.setForeground(Color.WHITE);
        //top.add(title, BorderLayout.WEST);
        //add(top, BorderLayout.NORTH) 
    public JPanel borrowedBox, availableBox, requestedBox;

    public HistoryFrame() {
        
        setBounds(20, 60, 1040, 650);
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        
        JLabel mainTitle = new JLabel("HISTORY", SwingConstants.CENTER);
        mainTitle.setFont(new Font("Times New Roman", Font.BOLD, 28));
        mainTitle.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(mainTitle, BorderLayout.NORTH);

        
        JPanel centerContainer = new JPanel(new GridLayout(3, 1, 0, 20)); 
        centerContainer.setBackground(Color.WHITE);
        centerContainer.setBorder(BorderFactory.createEmptyBorder(10, 50, 20, 50));

        borrowedBox = createBox("Borrowed Books");
        requestedBox = createBox("Requested Books");
        availableBox = createBox("Available Books");

        centerContainer.add(new JScrollPane(borrowedBox));
        centerContainer.add(new JScrollPane(requestedBox));
        centerContainer.add(new JScrollPane(availableBox));

        add(centerContainer, BorderLayout.CENTER);
    }

    private JPanel createBox(String titleText) {
        JPanel box = new JPanel();
        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
        box.setBackground(Color.WHITE);
        box.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        JLabel redLabel = new JLabel("[Red Label] " + titleText);
        redLabel.setForeground(Color.RED);
        redLabel.setFont(new Font("Arial", Font.BOLD, 18));
        redLabel.setBorder(BorderFactory.createEmptyBorder(10, 15, 5, 15));
        
        box.add(redLabel);
        return box;
    }

    // This method now adds a JLabel (the text line) instead of a Table Row
    public void addBorrowed(String book, String author) {
        JLabel entry = new JLabel("  - " + book + " by " + author);
        entry.setFont(new Font("Times New Roman", Font.BOLD, 18));
        entry.setBorder(BorderFactory.createEmptyBorder(2, 25, 2, 10));
        borrowedBox.add(entry);
        
        revalidate(); 
        repaint();
    }
}

        //sub panels
       // JPanel mainContent = new JPanel(new GridLayout(1,3,0,10));
       // mainContent.setBackground(Color.WHITE);
     //   mainContent.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        /*borrowedPanel= createSubPanel("BORROWED BOOKS");
        requestPanel= createSubPanel("REQUESTED BOOKS");
        availablePanel= createSubPanel("AVAILABLE BOOKS");
        mainContent.add(borrowedPanel);
        mainContent.add(availablePanel);
        mainContent.add(requestedPanel);
        add(mainContent, BorderLayout.CENTER);*/
        
        
        
   // }
  //  public void addhistory(String book, String author, String borrower, String contact_number ) {
      //  String title = "Borrowed Books";
       // JLabel sub_panel_title = new JLabel();
       // sub_panel_title.setText(title);
       /////// JPanel panel = new JPanel();
      //  JLabel label = new JLabel("Borrowed Books");
     //   label.setForeground(Color.red);
        //this.add(borrowedPanel);
        
    //}
    //ab
  /////  public void addhistory(String book, String author, int quantity) {
        //String title = "Available Books";
       // JLabel sub_panel_title = new JLabel();
      //  JPanel panel = new JPanel();
     //   JLabel label = new JLabel("Available Books");
      //  label.setForeground(Color.red);
        //this.add(availablePanel);
    
   // }
    //public void addhistory(String book, String author, String contact_number) {
       // String title = "Requested Books";
        ///JLabel sub_panel_title = new JLabel();
        //JPanel panel = new JPanel();
        //JLabel label = new JLabel("Requested Books");
       // label.setForeground(Color.red);
        //this.add(requestedPanel);
        
    }
    
}




