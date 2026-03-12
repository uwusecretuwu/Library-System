package project_0;

import java.awt.*;

import javax.swing.*;

public class RequestBooks extends JPanel{
	RequestBooks() {
		this.setBounds(20,60,1040,650);
		this.setLayout(new BorderLayout());
		this.setBackground(new Color(0,0,0));
		this.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new Color(153, 88, 42)));
		
		JPanel request_book_header = new JPanel(new BorderLayout());
		request_book_header.setBackground(new Color(153, 88, 42));
		request_book_header.setPreferredSize(new Dimension(0,40));
		request_book_header.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, new Color(153, 88, 42)));

		JLabel header_title = new JLabel(" REQUESTED BOOKS");
		header_title.setForeground(Color.black);
		header_title.setFont(new Font("Times New Roman", Font.BOLD, 28));
		
		JPanel button_container = new JPanel(new BorderLayout());
		
		JButton request_button = new JButton("Add");
		request_button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		request_button.setBackground(new Color(166, 138, 100));
		request_button.setForeground(new Color(237, 224, 212));
		
		JPanel center_container = new JPanel();
		center_container.setBackground(new Color(237, 224, 212));
		
		this.add(center_container);
		//header_title_container.add(header_title, BorderLayout.CENTER);
		button_container.add(request_button);
		request_book_header.add(button_container,BorderLayout.EAST);
		request_book_header.add(header_title, BorderLayout.WEST);
		this.add(request_book_header, BorderLayout.NORTH);
		
	}
}
