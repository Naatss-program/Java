package taskSynchronization;

class Group extends Thread {
	
	Pet arrow;
	
	public Group(Pet arrow) {
		this.arrow = arrow;
	}
	
	public void run() {
		for(int i=0; i<100; i++) {
			arrow.gold();
		}
	}
}
