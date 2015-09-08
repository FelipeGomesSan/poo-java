package tarefa03;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Lista {
	public static void main(String[] args){
		List<String> nomes = new ArrayList<String>();
		String[] aux = {"Leonardo", "Diana"};
		List<String> nomes2 = Arrays.asList(aux);
		System.out.println(nomes.size());
		nomes.add("Renzo");
		nomes.add(0, "Felipe");
		System.out.println(nomes.size());
		System.out.println(nomes);
		System.out.println(nomes2);
		for(String n:nomes){
			System.out.println(n);
		}
		
	}

}
