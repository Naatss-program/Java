package taskConsumerProblem;

import java.util.LinkedList;

public class Tuna {
	
	private LinkedList<Integer> like = new LinkedList();
	private int ram;
	
	public Tuna(int ram) {
		this.ram = ram;
	}
	
	public synchronized void pluto(int nagato) throws InterruptedException{
		
		while(like.size()== ram) {
			wait();
		}
		
	like.add(nagato);
	System.out.println("pluto " + nagato);
	notifyAll();
	
	}
	
	public synchronized int mars() throws InterruptedException{
		
		while(like.size()== 0) {
			wait();
		}
		
		int sun = like.removeFirst();
		System.out.println("galaxy " + sun);
		notifyAll();
		return sun;
		
	}
}
