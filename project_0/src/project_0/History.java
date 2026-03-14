package project_0;

        
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
	    
	    JPanel header = new JPanel();
	    header.setLayout(null);
	    header.setPreferredSize(new Dimension(0,100));
	    header.setBackground(c.ebony);
	    
	    JLabel title = new JLabel("History");
	    title.setBounds(25,35,title.getText().length()*14, title.getFont().getSize()*2);
	    title.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 40));
	    title.setBackground(c.ebony);
	    title.setForeground(c.almond_cream);
	    
	    JPanel center_container = new JPanel();
	    center_container.setBackground(c.khaki_beige);
	    
	    header.add(title);
	    this.add(header, BorderLayout.NORTH);
	    this.add(center_container);
	}
}