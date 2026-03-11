package project_0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class filer {

    private static final String FILE_NAME = "books/books.txt";

	public static List<String> findContentByName(String userInput) {
		// Remove ALL spaces
		// so for example Shin, "Harry Potter " becomes "HarryPotter"
		String cleanName = userInput.replaceAll("\\s+", ""); 
													// replace all spaces with ""
		List<String> bookContent = new ArrayList<>();
		boolean bookFound = false;
		String actualFileName = "";

		// Read the books.txt to check if that book exists
		try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
			String line;
			while ((line = br.readLine()) != null) {
				// Clean the line from the text file too, just in case!
				String cleanLine = line.trim().replaceAll("\\s+", "");
				if (cleanName.equalsIgnoreCase(cleanLine)) {
					bookFound = true;
					actualFileName = cleanLine + ".txt"; 
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading the master book list.");
			e.printStackTrace();
		}

		// If it does then read the content related to that book
		// which is found in a separate file
		if (bookFound) {
			// Now it looks for "BookName.txt"
			// IMPORTANT: Ensure actualFileName doesn't have hidden characters
			try (BufferedReader bookReader = new BufferedReader(new FileReader(actualFileName))) {
				String bookLine;
				while ((bookLine = bookReader.readLine()) != null) {
					bookContent.add(bookLine);
				}
			} catch (IOException e) {
				// This will trigger if the file is in the wrong folder
				System.out.println("Could not open file: " + actualFileName);
				e.printStackTrace();
			}
		}

		return bookContent;
	}
    public static void checkForFileExistence(String yourFile) {
        File file = new File(yourFile);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
