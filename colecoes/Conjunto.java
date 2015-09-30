package colecoes;
import aula6.Homem;
import aula5.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {
	

	public static void main(String [] args){
		Homem gomes = new Homem("Gomes");
		Homem gomesIdentico=renzo;
		Homem gomesIgual = new Homem("Gomes");
		
		Pessoa diana = new Pessoa("Diana");
		
		System.out.println(gomes==gomesIdentico);
		System.out.println(renzo==renzoIgual);
		System.out.println(gomes.equals(gomesIdentico));
		System.out.println(gomes.equals(gomesIgual));
		
		Set<Pessoa> pessoas=new HashSet<Pessoa>();
		pessoas.add(gomes);
		pessoas.add(gomesIdentico);
		pessoas.add(gomesIgual);
		pessoas.add(diana);
		
		System.out.println(pessoas);
				
	}

}
