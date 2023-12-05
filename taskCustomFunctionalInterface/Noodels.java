package taskCustomFunctionalInterface;

class Noodels {
	public static void main(String[]args) {
		
		Raman add = (a,b,c)-> a+b+c;
		
		Raman sub = (a,b,c)-> a-b-c;
		
		int resultAdd = Raman(45, 75, 85, add);
		int resultSub = Raman(754, -7854, 9854, sub);
		
		System.out.println("Added number: " + resultAdd);
		System.out.println("Subtracted number: " + resultSub);
	}

	public static int Raman(int a, int b, int c, Raman naruto) {
		
		return naruto.avoid(a,b,c);
	}
}