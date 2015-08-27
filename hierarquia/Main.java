package hierarquia;

import hierarquia.Animal;

public class Main {
	
	public Main(){
		Animal teste1 = new Gato("Gato", 5, 20);
		Animal teste2 = new Cachorro("Cão", 2, 15);
		 Animal bichos[] = {teste1, teste2};
		 
		 for(int i=0 ; i < bichos.length ; i++){
			 System.out.println("Raça: " + bichos[i].raca + " Idade:"+ bichos[i].idade+" Peso:"+bichos[i].peso);
             bichos[i].fazerbarulho();
             System.out.println();
		 }
      
	}

}
