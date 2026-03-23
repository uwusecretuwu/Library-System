package project_0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Filer {
	
	static String finished_line;
	
	public static void getFileName(File files) throws IOException {

		MutableAttributeSet set = new SimpleAttributeSet(MWindow.book_page_content.getParagraphAttributes());
		StyleConstants.setLineSpacing(set, 0.2f);
		MWindow.book_page_content.selectAll();
		MWindow.book_page_content.setParagraphAttributes(set, true);
		finished_line = "";
		MWindow.book_page_content.setText(finished_line);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(files));
			String line;
			while ((line = reader.readLine()) != null) {
				finished_line = finished_line + line + "\n";
			}
			MWindow.book_page_content.setText(finished_line);
			MWindow.book_page_content.setCaretPosition(0);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	
}

	
}
