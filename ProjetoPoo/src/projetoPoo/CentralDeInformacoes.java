package projetoPoo;

import java.util.ArrayList;
import java.util.List;

public class CentralDeInformacoes {
	
	private List<ProgramaDeTV> todosOsProgramas = new ArrayList<>();
	private List<Canal> todosOsCanais = new ArrayList<>();
 
	public List<ProgramaDeTV> getTodosOsProgramas() {
		return todosOsProgramas;
	}
	
	public void setTodosOsProgramas(List<ProgramaDeTV> todosOsProgramas) {
		this.todosOsProgramas = todosOsProgramas;
		
	}
	
	public boolean adicionarProgramaDeTV(ProgramaDeTV p) {
		if(!todosOsProgramas.contains(p)){
	        todosOsProgramas.add(p);
	        return true;
	    }else{
	        return false;
	    }
	}
	
	public boolean adicionarCanal(Canal canal) {
		if(!todosOsCanais.contains(canal)){
	        todosOsCanais.add(canal);
	        return true;
	    }else{
	        return false;
	    }
	}
	
	public ProgramaDeTV recuperarProgramaDeTVPeloId(ProgramaDeTV p) {
		for(int i = 0; i < todosOsProgramas.size(); i++) {
			if(todosOsProgramas.get(i).getID() == p.getID())
				return p;
		}
			return null;
		}	
	
	public Canal recuperarCanalPeloNome(String escolha) { //erro - ( 2 metodo (recuperar) da questao 5 )
		for(int i = 0; i < todosOsProgramas.size(); i++) {
			if(todosOsCanais.)
				return Canal;
		}
			return null;
		}

	}
	
	
