package stringManipulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextManipulation {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\naatu\\eclipse-workspace\\Task6\\src\\stringManipulation";
		String patternToFind = "Tamil";
		String replacementPattern = "Tamil Songs";
		
		try {
			BufferedReader design = new BufferedReader(new FileReader(filePath));
			StringBuilder myBook = new StringBuilder();
			String line;
		
			while ((line = design.readLine()) != null) {
                myBook.append(line).append("\n");
            }
            design.close();

            String updatedContent = myBook.toString().replaceAll(patternToFind, replacementPattern);

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(updatedContent);
            writer.close();

            System.out.println("Replacement completed successfully.");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


