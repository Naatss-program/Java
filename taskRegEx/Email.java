package taskRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		
		String email = "percy@gmail.com";
        String myEmail = "percy@yahoo.com"; //RegEx pattern of the Email

        Pattern pattern = Pattern.compile(myEmail);
        Matcher matcher = pattern.matcher(email);
		
        if (matcher.matches()) {
            System.out.println("Email ID is a Match");
        } else {
            System.out.println("Email ID is not a Match");
		}
		
	}

}
