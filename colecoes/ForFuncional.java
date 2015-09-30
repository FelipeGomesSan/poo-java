package colecoes;

import java.util.ArrayList;
import java.util.List;

public class ForFuncional {
	
	public static void main(String[] args){
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(0);
		numeros.add(1);
		numeros.add(2);
		
	//	for(int n: numeros){
		//	System.out.println(n);
	//	}
		
	//Consumer<Integer> cons = (Integer n) -> System.out.println(n);
	//numeros.forEach((Integer n) -> System.out.println(n));
		numeros.forEach(System.out::println);
		
	}
}
