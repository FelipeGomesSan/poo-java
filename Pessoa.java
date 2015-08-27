package aula5;

public class Pessoa {
	static final int OLHOS=2;
	public String nome;
	
	public String cumprimentar(){
		return "Olá, meu nome é"+this.nome+
				". Tenho olhos ="+this.OLHOS;
	}
	public Pessoa(String nome){
		System.out.println("Método construtor");
		//this.Nome=nome; //Referenciamento ao mesmo objeto
	}

}
