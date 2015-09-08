package tarefa03;

public class Vetor {
	
	public static void main(String[] args){
		int [] inteiros = new int[6];
		for(int i: inteiros){
			System.out.println(inteiros[i]);	
		}
		
		String [] nomes = {"Felipe", "Gomes"};
		for(String n: nomes){
			System.out.println(n);
		}
		System.out.println(nomes.length);
	}
	
}
