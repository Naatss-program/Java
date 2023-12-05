package taskFunctionalInterfaces1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Baruto {

	public static void main(String[] args) {
		
		Predicate<Integer> mario = num -> num % 2 == 0;
			System.out.println("Is 80 is Even " + mario.test(80));
				
		Function<Integer, Integer> darius = x -> x * x;
			System.out.println("Root of 864 " + darius.apply(864));
		
		Consumer<String> lucus = dark -> System.out.println(dark.toUpperCase());
			lucus.accept("have a nice day");
			
		Supplier<List<String>> marcus = ArrayList::new;
		List<String> steven = marcus.get();
		
		steven.add("Darkness");
		steven.add("of");
		steven.add("World");
		
		System.out.println("Demon Lord " + steven);
	}

}
