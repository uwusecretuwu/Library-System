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
        this.setBorder(BorderFactory.createMatteBorder(10,10,10,10, new Color(245,236,210) ));
        
        JPanel header = new JPanel();
        header.setLayout(null);
        header.setPreferredSize(new Dimension(0,55));
        header.setBackground(c.ebony);
            
        JLabel title = new JLabel("        HISTORY LOG");
        title.setBounds(12,10,title.getText().length()*20, title.getFont().getSize()*2);
        title.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 28));
        title.setBackground(new Color(3,108,23));
        title.setForeground(new Color(255,255,201));

        //center container
        
        
        header.add(title);
        this.add(header, BorderLayout.NORTH);
      

      
    }
}