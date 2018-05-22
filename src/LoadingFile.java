import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

//This loads and adds a page to an existing pdf file
public class LoadingFile {

	public static void main(String[] args) throws IOException{

		
		File file = new File("C:/Programming/PdfBox/EmptyPdf.pdf"); 
			
		if(file != null) {
			PDDocument document = PDDocument.load(file); 	
			System.out.println("PDF Loaded");	
			
			
			document.addPage(new PDPage());
			document.save(file);
			document.close(); 
		}
	}
}