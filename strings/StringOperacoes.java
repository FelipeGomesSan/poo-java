package strings;

public class StringOperacoes {
	public static void main(String[] args){
		String g="Gomes";
		StringBuilder builder=new StringBuilder(g);
		
		for(char i='A'; i<'Z';i++){
			g+=1;
			System.out.println(g);
			
		}
		
		g=builder.toString();
		
		System.out.println("String realmente utilizado: "+g);
		System.out.println(builder.delete(6, 9));
		System.out.println(builder.insert(6, "BCD"));
	}

}
