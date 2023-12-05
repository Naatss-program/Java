package taskTokenization;

import java.util.StringTokenizer;

public class Task {

	public static void main(String[] args) {
		
		StringTokenizer text = new StringTokenizer("Have a Wonderful day", "der");
		
		while(text.hasMoreTokens()) {
			
			System.out.println(text.nextToken());
		}
	}

}
