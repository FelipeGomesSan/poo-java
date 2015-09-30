package colecoes;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Carta implements Comparable<Baralho>{
	private String naipe;
	private String numero;
	
	public Carta(String numero, String naipe){
		super();
		this.numero=numero;
		this.naipe=naipe;
	}
	
	public static void main(String[] args){
		Carta asDePaus=new Carta("A","U+2663");
		Carta asDePaus2=new Carta("A","U+2663");
		Carta seteDeCopas=new Carta("7","U+2661");
		Carta doisDeEspadas=new Carta("2","U+2663");
		
		
		Set<Carta> deck1=new HashSet<Carta>();
		deck1.add(asDePaus);
		deck1.add(doisDeEspadas);
		
		Set<Carta> deck2=new HashSet<Carta>();
		deck2.add(seteDeCopas);
		deck2.add(doisDeEspadas);
		
		System.out.println(deck1.contains(asDePaus2));
		System.out.println(deck2.contains(doisDeEspadas));
		
		deck2.retainAll(deck1);
		System.out.println(deck1.contains(seteDeCopas));
	}
	
	@Override
	public String toString() {
		return "Carta [naipe=" + naipe + ", numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naipe == null) ? 0 : naipe.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (naipe == null) {
			if (other.naipe != null)
				return false;
		} else if (!naipe.equals(other.naipe))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	public int compareTo(Carta o) {
			int comp= this.numero.compareTo(o.numero);
			if(comp==0){
				Map<String, Integer> pesosNaipes= new HashMap<String, Integer>();
				
			}else{
				return comp;
			}
			return comp;
	}

	@Override
	public int compareTo(Baralho o) {
		return 0;
	}
	
}
