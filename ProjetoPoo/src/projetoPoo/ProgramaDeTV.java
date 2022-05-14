package projetoPoo;

public class ProgramaDeTV {
	private long id;
	private String nome;
	private TipoDePrograma tipo;
	private DiaDaSemana dia;
	private Canal canal;
	
	public ProgramaDeTV(String nome, TipoDePrograma tipo, DiaDaSemana dia) {
		this.nome = nome;
		this.tipo = tipo;
		this.dia = dia;
		id = System.currentTimeMillis();
	}
	
	public void definirID() {
		id = System.currentTimeMillis();
	}
	
	public String toString() {
		return "O nome do programa é: " + nome;
	}
	public long getID() {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setTipo(TipoDePrograma tipo) {
		this.tipo = tipo;
	}
	public TipoDePrograma getTipo() {
		return tipo;
	}
	public void setDia(DiaDaSemana dia) {
		this.dia = dia;
	}
	public DiaDaSemana getDia() {
		return dia;
	}

}
