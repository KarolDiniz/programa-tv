package transmissao;

public class Canal {
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String tipoDoCanal;
	
	public Canal() {
		
	}
	
	public Canal(String nome, String tipoDoCanal) {
		this.nome = nome;
		this.setTipoDoCanal(tipoDoCanal);
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

	public String getTipoDoCanal() {
		return tipoDoCanal;
	}

	public void setTipoDoCanal(String tipoDoCanal) {
		this.tipoDoCanal = tipoDoCanal;
	}
	
	
}
