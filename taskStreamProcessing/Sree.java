package taskStreamProcessing;

import java.util.Arrays;
import java.util.List;

public class Sree {

	public static void main(String[] args) {
		
		List<Integer> oven = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		//filtering 
		List<Integer> even = oven.stream().filter(num-> num% 2 ==0).toList();
		System.out.println("Even number: " + even);
		
		//mapping
		List<Integer> great = oven.stream().map(num-> num*2).toList();
		System.out.println("High value: " + great);
		
		//reducing
		int mayham = oven.stream().reduce(0, Integer::sum);
		System.out.println("Number of sum: " + mayham);
	}

}
