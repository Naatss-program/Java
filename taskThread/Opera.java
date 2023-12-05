package taskThread;

class Opera implements Runnable {

	@Override
	public void run() {
		System.out.println("Every good has its Evil hidden");
	}

}

class Mini {
	public static void main(String[]args) {
		
		Opera sales = new Opera();
		
		Thread person = new Thread(sales);
		
		person.start();
	}
}