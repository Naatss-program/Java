package taskSynchronization;

class Pet {
	
	private int storage = 0;
	
	public synchronized void gold() {
		storage++;
	}
	
	public synchronized int getstorage() {
		return storage;
	}
	
}
