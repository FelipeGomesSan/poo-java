package strings;
public class StringMain {
	public static void main(String[] args){
		String gomes ="Gomes";
		String gomes2="Gomes";
		String gomesNew=new String("Gomes");
		
		System.out.println(gomes==gomes2);
		System.out.println(gomes==gomesNew);
		System.out.println(gomes.equals(gomes2));
		System.out.println(gomes.equals(gomesNew));
		
		System.out.println(gomes.charAt(0));
		gomes=gomes.concat("n");
		System.out.println(gomes);
		
		System.out.println(gomes.equals("GoMesN"));
		System.out.println(gomes.equalsIgnoreCase("GoMesN"));
		
		System.out.println(gomes.toLowerCase());
		System.out.println(gomes.toUpperCase());
		
		
	}

}
