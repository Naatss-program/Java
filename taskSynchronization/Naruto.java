package taskSynchronization;

public class Naruto {

	public static void main(String[] args) {
		
		Pet animal = new Pet();
		
		Group team1 = new Group(animal);
		Group team2 = new Group(animal);
		Group team3 = new Group(animal);
		
		team1.run();
		team2.run();
		team3.start();
		
	try {
		team1.join();
		team2.join();
		team3.join();
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	
		System.out.println("Over all Count: " + animal.getstorage());
	}

}
