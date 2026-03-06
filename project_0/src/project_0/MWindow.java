package project_0;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MWindow extends JFrame implements ActionListener {

	// Declaration
	// Menu
	JMenuBar Menubar;
	JMenu file;
	JMenu edit;
	// Panels
	JPanel PMenubar;

	String[] cars = { "item1", "item2", "item3" };

	public MWindow() {
		//Main JFrame window
		this.setTitle("Alexandria");
		this.setSize(500, 500);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // if we close the main window all other windows will close
		this.setLocationRelativeTo(null);
		
		//Panels
		
		//MenuBar
		Menubar = new JMenuBar();
		UIManager.put("MenuBar.background", new Color(142, 217, 72));// To customize Color of MenuBar
		file = new JMenu("file");
		edit = new JMenu("edit");
		
		
		//Adding things to the Window
		Menubar.add(file);
		Menubar.add(edit);
		this.setJMenuBar(Menubar); // makes the actual bar in the menu bar visible
		
		//Method Implementations
		menumaker(cars, file);

	}

	public void menumaker(String[] menuitem, JMenu menu) {

		// this is a foreach loop
		// for each String in menuitem repeat that many times
		for (String item : menuitem) {
			JMenuItem menuitemcontent = new JMenuItem(item);
			menu.add(menuitemcontent);
			menuitemcontent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource().equals(menuitem[0])) {
						System.out.println(e.getSource()); // out of service for now
					}
				}
			});// actionlistener ends here

		}

	}

	/*
	 * public void buttonmaker(String btn1, int btnsize) { JButton Button = new
	 * JButton(btn1); Button.setSize(btnsize, btnsize); PMenubar.add(Button);
	 * Button.addActionListener(new ActionListener() { public void
	 * actionPerformed(ActionEvent e) {
	 * 
	 * if (e.getSource().equals(Button)) { System.out.println("clicked"); } } });
	 * 
	 * }
	 */

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
