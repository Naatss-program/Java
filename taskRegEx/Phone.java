package taskRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

public static void main(String[] args) {
		
		String call = "87422145215";
        String myCall = "87422145215";

        Pattern pattern = Pattern.compile(myCall);
        Matcher matcher = pattern.matcher(call);
		
        if (matcher.matches()) {
            System.out.println("Mobile no. is a Match");
        } else {
            System.out.println("Mobile no. is not a Match");
		}
		
	}

}
