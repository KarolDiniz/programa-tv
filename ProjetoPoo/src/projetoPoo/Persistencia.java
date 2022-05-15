package projetoPoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Persistencia {
	
	private XStream xStream = new XStream(new DomDriver("UTF-8"));
	
	public void salvarCentral(CentralDeInformacoes central, String centralXML) throws Exception { //Realiza a persistÃªncia dos dados e converte o arquivo para XML
		File arquivo = new File(centralXML);
		arquivo.createNewFile();
		
		PrintWriter pw = new PrintWriter(arquivo);
		String xml = "<?xml version=\"1.0\" encoding =\"UTF-8\" ?>\n"; //abertura do arquivo
		xml += xStream.toXML(central);
		pw.print(xml);
		pw.close();
		
		}
	
	public CentralDeInformacoes recuperarCentral(String centralXML) throws Exception { //Converte o arquivo XML para o objeto requerido
		File arquivo = new File(centralXML);
		if(arquivo.exists()) { //verifica existÃªncia do arquivo
			FileInputStream fis = new FileInputStream(arquivo);
			return (CentralDeInformacoes) xStream.fromXML(fis); //retorna o objeto com os dados salvos
		}else {
			throw new Exception("Recuperação inválida! [não há arquivo] ");
			
			
		}
		
	}

}
