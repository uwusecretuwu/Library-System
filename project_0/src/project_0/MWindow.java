package project_0;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MWindow extends JFrame implements ActionListener{
	
	//Declaration
	JMenuBar Menubar;
	JMenu file;
	JMenu edit;
	
	
	public MWindow() {
		
		this.setVisible(true);
		this.setTitle("Project 0");
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // if we close the main window all other windows will close
		
		JPanel PMenubar;
		PMenubar = new JPanel();
		PMenubar.setPreferredSize(new Dimension(100,100));
		PMenubar.setLayout(new FlowLayout());
		Menubar = new JMenuBar();
		file = new JMenu("file");
		
		PMenubar.add(Menubar);
		Menubar.add(file);
		this.add(PMenubar);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
