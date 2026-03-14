package project_0;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorrowedBooks extends JPanel implements ActionListener {

	int scroll_speed = 16;
    JButton btnadd;
    JLabel title;
    JPanel gridpanel;
    JPanel top;
    JPanel right;
    JPanel center;
    
    public BorrowedBooks() {
    	

        setBounds(20,60,1040,650);
        setLayout(new BorderLayout());
        setVisible(false);
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
        gridpanel = new JPanel();
        gridpanel.setLayout(new BoxLayout(gridpanel, BoxLayout.Y_AXIS));
        gridpanel.setOpaque(false);
        gridpanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));       
        
        JScrollPane scroll = new JScrollPane(gridpanel);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.getVerticalScrollBar().setUnitIncrement(scroll_speed); //speed scroll
        scroll.getViewport().setBackground(new Color(245, 235, 210));
        center.add(scroll, BorderLayout.CENTER);
        
    }

    public void addBook(String title, String author, String name, String contactno, String dateborrowed) 
    {
//now we border panels to the grids
        JPanel border = new JPanel();
        border.setLayout(new BorderLayout(10,10));
        border.setBackground(new Color(245, 235, 210));
        border.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(153, 88, 42)));
        border.setMaximumSize(new Dimension(Integer.MAX_VALUE, 200));
        border.setAlignmentX(Component.LEFT_ALIGNMENT);
        JTextArea txtarea = new JTextArea(" Book Title: " + title +
                                          "\n Author: " + author +
                                          "\n Name: " + name +
                                          "\n Contact Number: " + contactno+
                                          "\n Date Borrowed: "+dateborrowed );
        
        txtarea.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        txtarea.setBackground(new Color(245, 235, 210));
        txtarea.setEditable(false);
        txtarea.setLineWrap(true);
        txtarea.setWrapStyleWord(true);
        border.add(txtarea, BorderLayout.CENTER);
                

        JButton remover = new JButton("REMOVE");
        remover.setBackground(new Color(90,30,0));
        remover.setForeground(Color.WHITE);
        JPanel buttonpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonpanel.setOpaque(false);
        buttonpanel.add(remover);
        border.add(buttonpanel, BorderLayout.SOUTH);
        remover.addActionListener(e -> {
        gridpanel.remove(border);
        gridpanel.revalidate();
        gridpanel.repaint();
        });
        gridpanel.add(border);
        gridpanel.add(Box.createRigidArea(new Dimension(0, 10)));
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
