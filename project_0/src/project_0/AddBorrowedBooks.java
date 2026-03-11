package project_0;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddBorrowedBooks extends JDialog implements ActionListener
{
    private final JTextField txttitle;
    private final JTextField txtauthor;
    private final JTextField txtname;
    private final JTextField txtcontactno;
    private final JTextField txtdateborrowed;
    private final JButton btnadd;
    private final BorrowedBooks mainm;
  public AddBorrowedBooks(BorrowedBooks mainm)
  {
        super(mainm, "Borrow Book", true);
        this.mainm = mainm;

        setLayout(new GridLayout(6, 2, 10, 10));
        setSize(350, 300);
        setLocationRelativeTo(mainm);
        add(new JLabel("Title:"));
        txttitle = new JTextField();
        add(txttitle);
        add(new JLabel("Author:"));
        txtauthor = new JTextField();
        add(txtauthor);
        add(new JLabel("Name:"));
        txtname = new JTextField();
        add(txtname);
        add(new JLabel("Contact Number:"));
        txtcontactno = new JTextField();
        add(txtcontactno);
        add(new JLabel("Date Borrowed:"));
        txtdateborrowed = new JTextField();
        add(txtdateborrowed);
        btnadd = new JButton("Add");
        btnadd.addActionListener(this);
        add(new JLabel());
        add(btnadd);
  }
  @Override
    public void actionPerformed(ActionEvent e) 
    {

        if (e.getSource() == btnadd) 
            {

            String title = txttitle.getText().trim();
            String author = txtauthor.getText().trim();
            String name = txtname.getText().trim();
            String borrower_contactno = txtcontactno.getText().trim();
            String borrowed = txtdateborrowed.getText().trim();

            if (!title.isEmpty() && !author.isEmpty() && !name.isEmpty() &&
                !borrower_contactno.isEmpty() && !borrowed.isEmpty()) {

                mainm.addBook(title, author, name, borrower_contactno, borrowed); 
                dispose();

            } else 
            {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            }
        }
    }
}

