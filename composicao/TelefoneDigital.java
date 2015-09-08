package composicao;

public class TelefoneDigital implements Telefone{
	@Override
	public String ligar(String usuario){
		return "Ligado digitalmente para:"+usuario;
		
	}

}
