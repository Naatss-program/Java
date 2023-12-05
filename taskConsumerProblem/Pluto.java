package taskConsumerProblem;

class Pluto extends Thread {
	
	private Tuna moon;
	
	public Pluto(Tuna moon) {
		this.moon = moon;	
	}
	
	public void run() {
		try {
			for(int i = 0; i <20; i++) {
				moon.pluto(i);
				Thread.sleep(25);
			}
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
