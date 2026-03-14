package project_0;

        
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
	
	Colors c = new Colors();
	History() {
	    this.setBounds(20,60,1040,650);
	    this.setBackground(c.black);
	    this.setLayout(new BorderLayout());
	    
	}
}