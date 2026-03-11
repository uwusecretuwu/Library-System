package project_0;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		MWindow window = new MWindow();
		window.setBookTitle("HarryPotter", "J.K. Rowling");
		// splash_screen Splash = new splash_screen();
		window.setVisible(true);
		
		/*filer Filer = new filer();
		Filer.checkForFileExistence("books/books.txt");

		String book =window.searchbar.getText();

		List<String> result = Filer.findContentByName(book);

		if (result.isEmpty()) {
			System.out.println("No content found for: " + book);
		} else {
			System.out.println("\n--- Book Content ---");
			for (String line : result) {
				System.out.println(line);
			}
		}

		System.out.println("\n\n\n"); */
	}
}

// BorrowedBooks bb = new BorrowedBooks();
// bb.setSize(500,500);
// bb.setVisible(true);
// if(Splash.progressbarisdone == true) {
// window.isvisible = true;
// BorrowedBooks bb = new BorrowedBooks();
