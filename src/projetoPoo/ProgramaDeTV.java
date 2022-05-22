package projetoPoo;

public class ProgramaDeTV {
	private long id;
	private String nome;
	private TipoDePrograma tipo;
	private DiaDaSemana[] dia = new DiaDaSemana[7];
	private Canal canal;
	
	public Canal getCanal() {
		return canal;
	}

	public void setCanal(Canal canal) {
		this.canal = canal;
	}

	public ProgramaDeTV(String nome, TipoDePrograma tipo, DiaDaSemana[] dia, Canal canal) {
		this.nome = nome;
		this.tipo = tipo;
		this.dia = dia;
		this.canal = canal;
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
	public void setDia(DiaDaSemana[] dia) {
		this.dia = dia;
	}
	public DiaDaSemana[] getDia() {
		return dia;
	}

}
