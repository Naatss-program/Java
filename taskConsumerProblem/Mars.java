package taskConsumerProblem;

class Mars extends Thread {
	
	private Tuna atom;
	
	public Mars(Tuna atom) {
		this.atom = atom;
	}
	
	public void run() {
		try {
			for(int i = 0; i <20; i++) {
				atom.mars();
				Thread.sleep(30);
			}
		}
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}