package project_0;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

import javax.swing.*;
import javax.swing.table.*;

public class RequestBooks extends JPanel {
    
    private JTable requestTable;
    private DefaultTableModel tableModel;
    private JTextField bookNameField, requesterNameField, contactNoField;
    private JButton request_button;
    
    RequestBooks() {
        this.setBounds(20, 60, 1040, 650);
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(0, 0, 0));
        this.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(153, 88, 42)));
        this.setVisible(false);
        
        // Header Panel
        JPanel request_book_header = new JPanel(new BorderLayout());
        request_book_header.setBackground(new Color(153, 88, 42));
        request_book_header.setPreferredSize(new Dimension(0, 40));
        request_book_header.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, new Color(153, 88, 42)));

        JLabel header_title = new JLabel(" REQUESTED BOOKS");
        header_title.setForeground(Color.black);
        header_title.setFont(new Font("Times New Roman", Font.BOLD, 28));
        
        // Button container for header
        JPanel button_container = new JPanel(new BorderLayout());
        
        request_button = new JButton("Add");
        request_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
        request_button.setBackground(new Color(166, 138, 100));
        request_button.setForeground(new Color(237, 224, 212));
        request_button.setPreferredSize(new Dimension(80, 30));
        request_button.setFocusPainted(false);
        
        button_container.add(request_button);
        button_container.setBackground(new Color(153, 88, 42));
        
        request_book_header.add(button_container, BorderLayout.EAST);
        request_book_header.add(header_title, BorderLayout.WEST);
        
        // Center Container - Main Content
        JPanel center_container = new JPanel(new BorderLayout(10, 10));
        center_container.setBackground(new Color(237, 224, 212));
        center_container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Form Panel (Top)
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(237, 224, 212));
        formPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(153, 88, 42), 2),
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Labels
        JLabel bookNameLabel = new JLabel("Name of Book Requested:");
        bookNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        bookNameLabel.setForeground(new Color(80, 50, 30));
        
        JLabel requesterNameLabel = new JLabel("Name of Requester:");
        requesterNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        requesterNameLabel.setForeground(new Color(80, 50, 30));
        
        JLabel contactNoLabel = new JLabel("Contact No (optional) :");
        contactNoLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        contactNoLabel.setForeground(new Color(80, 50, 30));
        
        // Text Fields
        bookNameField = new JTextField(25);
        bookNameField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        bookNameField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(153, 88, 42), 2),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        
        requesterNameField = new JTextField(25);
        requesterNameField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        requesterNameField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(153, 88, 42), 2),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        
        contactNoField = new JTextField(25);
        contactNoField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        contactNoField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(153, 88, 42), 2),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        
        // Add components to form panel
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(bookNameLabel, gbc);
        
        gbc.gridx = 1; gbc.gridy = 0;
        formPanel.add(bookNameField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(requesterNameLabel, gbc);
        
        gbc.gridx = 1; gbc.gridy = 1;
        formPanel.add(requesterNameField, gbc);
        
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(contactNoLabel, gbc);
        
        gbc.gridx = 1; gbc.gridy = 2;
        formPanel.add(contactNoField, gbc);
        
        // Table Panel (Center)
        JPanel tablePanel = new JPanel(new BorderLayout(0, 10));
        tablePanel.setBackground(new Color(237, 224, 212));
        tablePanel.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        
        // Table Label
        JLabel tableLabel = new JLabel("List of Requested Books");
        tableLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        tableLabel.setForeground(new Color(80, 50, 30));
        
        // Create Table
        String[] columnNames = {"No.", "Book Name", "Requester Name", "Contact No. Optional"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        requestTable = new JTable(tableModel);
        requestTable.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        requestTable.setRowHeight(28);
        requestTable.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
        requestTable.getTableHeader().setBackground(new Color(153, 88, 42));
        requestTable.getTableHeader().setForeground(Color.WHITE);
        requestTable.setSelectionBackground(new Color(166, 138, 100));
        requestTable.setSelectionForeground(Color.WHITE);
        requestTable.setGridColor(new Color(153, 88, 42));
        requestTable.setShowGrid(true);
        
        // Set column widths
        TableColumnModel columnModel = requestTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(250);
        columnModel.getColumn(3).setPreferredWidth(150);
        
        JScrollPane scrollPane = new JScrollPane(requestTable);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(153, 88, 42), 2));
        
        tablePanel.add(tableLabel, BorderLayout.NORTH);
        tablePanel.add(scrollPane, BorderLayout.CENTER);
        
        // Add form and table to center container
        center_container.add(formPanel, BorderLayout.NORTH);
        center_container.add(tablePanel, BorderLayout.CENTER);
        
        // Add action listener for Add button
        request_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRequest();
            }
        });
        
        // Add sample data
        addRequestToTable("Math", "Angelica", "9382827234");
        
        // Add components to main panel
        this.add(request_book_header, BorderLayout.NORTH);
        this.add(center_container, BorderLayout.CENTER);
    }
    
    private void addRequest() {
        String bookName = bookNameField.getText().trim();
        String requesterName = requesterNameField.getText().trim();
        String contactNo = contactNoField.getText().trim();
        
        History.addRequestedBooks(bookName, requesterName, contactNo, LocalDate.now().toString());
        
        if (bookName.isEmpty() || requesterName.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Please fill in all fields!", 
                "Input Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        addRequestToTable(bookName, requesterName, contactNo);
        
        // Clear fields
        bookNameField.setText("");
        requesterNameField.setText("");
        contactNoField.setText("");
        
        JOptionPane.showMessageDialog(this, 
            "Book request added successfully!", 
            "Success", 
            JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void addRequestToTable(String bookName, String requesterName, String contactNo) {
        int rowCount = tableModel.getRowCount() + 1;
        tableModel.addRow(new Object[]{rowCount, bookName, requesterName, contactNo});
    }
}