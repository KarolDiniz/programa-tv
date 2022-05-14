package projetoPoo;

public class Canal {
	
	private String nome;
	private String tipoDoCanal;
	
	public Canal() {
		
	}
	
	public Canal(String nome, String tipoDoCanal) {
		this.nome = nome;
		this.tipoDoCanal = tipoDoCanal;
	}
	
	public String toString() {
		return "Nome do canal: " + nome;
		
	}
	
	public boolean equals(Canal c) {
		if(this.nome.equals(c.nome)) {
			return true;
		}
		return false;
	}
	
	
}
