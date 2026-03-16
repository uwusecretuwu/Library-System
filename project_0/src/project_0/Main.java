package project_0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.swing.JTextPane;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class Main {

	static String book_to_search;
	static String finished_line;
	static MWindow window = new MWindow();

	public static void main(String[] args) {
		//plash_screen Splash = new splash_screen();
		window.setVisible(true);

	}

	public static void getFileName(File files) throws IOException {

		MutableAttributeSet set = new SimpleAttributeSet(window.book_page_content.getParagraphAttributes());
		StyleConstants.setLineSpacing(set, 0.2f);
		window.book_page_content.selectAll();
		window.book_page_content.setParagraphAttributes(set, true);
		finished_line = "";
		window.book_page_content.setText(finished_line);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(files));
			String line;
			while ((line = reader.readLine()) != null) {
				finished_line = finished_line + line + "\n";
			}
			window.book_page_content.setText(finished_line);
			window.book_page_content.setCaretPosition(0);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
