package hierarquia;

import hierarquia.Animal;

public class Cachorro extends Animal{

	public Cachorro(String raca, int idade, float peso) {
		super(raca, idade, peso);
		// TODO Auto-generated constructor stub
	}
	
 @Override
    public void fazerbarulho(){
    	System.out.println("AUAU");
    }

}
