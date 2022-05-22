package projetoPoo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeradorDeRelatorios {
	
	public static void obterProgramacaoDeUmCanal(Canal canalTipo) {
		
		Persistencia p = new Persistencia();
		
		CentralDeInformacoes c = p.recuperarCentral();
				
		Document doc = new Document(PageSize.A4);
		

		try {
			OutputStream os = new FileOutputStream("relatório.pdf");
			PdfWriter.getInstance(doc, os);
			
			doc.open();
			
			Paragraph canal = new Paragraph(canalTipo.getNome() + "\n");
			
			doc.add(canal);
			
			for(ProgramaDeTV programa: c.getTodosOsProgramas()) {
				
				if(programa.getCanal().getNome().equals(canalTipo.getNome())) {
					
					Paragraph pg = new Paragraph(programa.toString() + "\n");
					
					doc.add(pg);
					
				}
			
			}
			doc.close();
				
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
					
			
			
	}
		
}
