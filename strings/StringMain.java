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
		
	}

}
