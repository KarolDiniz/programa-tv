package projetoPoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Persistencia {
	
	private XStream xstream = new XStream(new DomDriver());
	private File arquivo = new File("Central.xml");
	
	public void salvarCentral(CentralDeInformacoes c) {
		
		String xml = xstream.toXML(c);
		
			try {
				if(!arquivo.exists()) 
					arquivo.createNewFile();
				PrintWriter gravar = new PrintWriter(arquivo);
				gravar.print(xml);
				gravar.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	public CentralDeInformacoes recuperarCentral() {
		
			try {
				if(arquivo.exists()) {
					FileInputStream arquivoF = new FileInputStream(arquivo);
					return(CentralDeInformacoes) xstream.fromXML(arquivoF);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return new CentralDeInformacoes();
	}

}
