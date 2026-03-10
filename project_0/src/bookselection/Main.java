package bookselection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class Main implements ActionListener {

	public static void getFileName(String file) {
		File files = new File("books.txt");
		System.out.println(files.exists());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		JPanel panel = new JPanel(null);
		JTextArea page = new JTextArea();
		JTextField searchbar = new JTextField();
		JButton search_btn = new JButton("Search");

		window.setSize(600, 600);
		window.setLayout(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(3);
		window.setLocationRelativeTo(null);

		panel.setBackground(new Color(100, 100, 100));
		panel.setBounds(50, 50, 500, 500);

		searchbar.setBounds(100, 5, 100, 20);
		search_btn.setBounds(205, 5, 20, 20);
		search_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == search_btn) {
					System.out.println("search");
					getFileName(searchbar.getText());
				}
			}

		});

		page.setText("aiugdsjksabdiuasdkjsad\n aioshdkjasddss");
		page.setBounds(0, 0, panel.getWidth() - 10, panel.getHeight() - 10);
		page.setEditable(false);

		panel.add(page);
		window.add(search_btn);
		window.add(searchbar);
		window.add(panel);
		window.repaint();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
