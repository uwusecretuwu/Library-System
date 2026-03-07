package project_0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MenuItemMaker {
	
	public void MenuItemMakers(String[] menuitem, JMenu menu) {

		// this is a foreach loop
		// for each String in menuitem repeat that many times
		for (String item : menuitem) {
			JMenuItem menuitemcontent = new JMenuItem(item);
			menu.add(menuitemcontent);
			menuitemcontent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					// complicated and a bit unecessary way of doing it
					if (menuitemcontent.getLabel().equals(menuitem[0])) {
						System.out.println(menuitem[0]);
					}
					// easy way to do it (very case sensitive and not very felxible)
					/*switch (menuitemcontent.getLabel()) {
					case "item1":
						System.out.println("switch case Item 1");
						break;
					}*/
				}
			});// actionlistener ends here
		}
	}
}