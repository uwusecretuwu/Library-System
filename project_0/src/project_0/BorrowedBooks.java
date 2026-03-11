package project_0;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorrowedBooks extends JPanel implements ActionListener {

    JButton btnadd;
    JLabel title;
    JPanel gridpanel;
    JPanel top;
    JPanel right;
    JPanel center;
    
    public BorrowedBooks() {

        setBounds(20,60,1040,650);
        setLayout(new BorderLayout());
        //all stuffs sa taas
        top = new JPanel(new BorderLayout());
        top.setBackground(new Color(90, 30, 0));
        title = new JLabel("BORROWED BOOKS");
        title.setFont(new Font("Times New Roman", Font.BOLD, 28));
        title.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        title.setForeground(Color.WHITE);
        top.add(title, BorderLayout.WEST);
        //bttn right side ;]
        btnadd = new JButton("ADD");
        btnadd.setFont(new Font("Times New Roman", Font.BOLD, 10));
        btnadd.addActionListener(this);
        btnadd.setBackground(new Color(245,235,210));
        //bttn placement
        right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 19, 16));
        right.setOpaque(false);
        right.add(btnadd);
        top.add(right, BorderLayout.EAST);
        add(top, BorderLayout.NORTH);
        //borders
        JPanel side2= new JPanel();
        JPanel side1= new JPanel();
        JPanel down= new JPanel();
        side1.setBackground(new Color(90,30,0));
        add(side1, BorderLayout.EAST);
        side2.setBackground(new Color(90,30,0));
        add(side2, BorderLayout.WEST);
        down.setBackground(new Color(90,30,0));
        add(down, BorderLayout.SOUTH);
        
        //grids and shits (center panel) adn where informations be stored
        center = new JPanel(new BorderLayout());
        center.setBackground(new Color(245, 235, 210));
        add(center, BorderLayout.CENTER);
        gridpanel = new JPanel(new GridLayout(0, 2, 20, 20));
        gridpanel.setOpaque(false);
        center.add(gridpanel, BorderLayout.CENTER);
        
        
    }

    public void addBook(String title, String author, String name, String contactno, String dateborrowed) 
    {
//now we border panels to the grids
        JPanel border = new JPanel();
        border.setLayout(null);
        border.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),5));
        border.setBackground(new Color(245, 235, 210));
        JTextArea txtarea = new JTextArea("Book Title: " + title +
                                          "\nAuthor: " + author +
                                          "\nName: " + name +
                                          "\nContact Number: " + contactno+
                                          "\nDate Borrowed: "+dateborrowed );
        
        txtarea.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        txtarea.setBackground(new Color(245, 235, 210));
        txtarea.setEditable(false);
        txtarea.setBounds(10, 10, 280, 160);
        border.add(txtarea);
        

        JButton remover = new JButton("REMOVE");
        remover.setBounds(10, 180, 100, 30);
        border.add(remover);
        remover.setBackground(new Color(90,30,0));
        remover.setForeground(Color.WHITE);
        remover.addActionListener(e -> {
        gridpanel.remove(border);
        gridpanel.revalidate();
        gridpanel.repaint();
        });
        gridpanel.add(border);
        gridpanel.revalidate();
        gridpanel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnadd) {
            AddBorrowedBooks bb = new AddBorrowedBooks(this);
            bb.setVisible(true);
        }
    }
}
