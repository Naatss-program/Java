package taskThread;

class Lion extends Thread{
	
	public void run() {
		System.out.println("Wolf has more knowledge");
	}

}

class LionCub {
	
	public static void main(String[]args) {
		Lion cub = new Lion();
		cub.run();
	}
}
