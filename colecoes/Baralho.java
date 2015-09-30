package colecoes;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Baralho implements Iterable<Carta>, Iterator<Carta> {
	private List<Carta> cartas = new ArrayList<Carta>();
	private int cartaAtualIndex=0;

	public Baralho() {
		new Carta("","");
		
		cartas.add(new Carta("",""));
		cartas.add(new Carta("",""));
		cartas.add(new Carta("",""));
		cartas.add(new Carta("",""));
		cartas.add(new Carta("",""));
		cartas.add(new Carta("",""));
	}
	
	public static void main(String[] args){
		
	}
	
	@Override
	public Iterator<Carta> iterator(){
		cartaAtualIndex=0;
		return this;
		
	}
	
	@Override
	public String toString() {
		return "Baralho [cartas=" + cartas + "]";
	}

	@Override
	public boolean hasNext() {
		return cartaAtualIndex<cartas.size();
	}

	@Override
	public Carta next() {
		Carta cartaAtual= cartas.get(cartaAtualIndex);
		return cartaAtual;
	}

}
