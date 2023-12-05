package taskConsumerProblem;

public class Universe {

	public static void main(String[] args) {
		Tuna black = new Tuna(10);
		
		Pluto blue = new Pluto(black);
		Mars red = new Mars(black);
		
		blue.start();
		red.start();
	}

}
