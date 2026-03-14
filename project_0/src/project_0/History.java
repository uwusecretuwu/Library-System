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
        this.setBackground(new Color(242, 236, 222));
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createMatteBorder(10,10,10,10, c.ebony ));
        
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setPreferredSize(new Dimension(0,55));
        header.setBackground(c.ebony);
            
        JLabel title = new JLabel("        HISTORY LOG");
        title.setBounds(15,10,title.getText().length()*18, title.getFont().getSize()*2);
        title.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 28));
        title.setBackground(c.ebony);
        title.setForeground(c.almond_cream);

        //center container
        
        
        header.add(title);
        this.add(header, BorderLayout.NORTH);
      

      
    }
}