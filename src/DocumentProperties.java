import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentInformation;
import org.apache.pdfbox.pdmodel.PDPage;

public class DocumentProperties {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File file = new File("C:/Programming/PdfBox/EmptyPdf.pdf"); 
		
		PDDocument document = new PDDocument(); 
		
		PDPage blankPage = new PDPage(); 
		
		document.addPage(blankPage);
		
		PDDocumentInformation documentInformation = document.getDocumentInformation(); 
		
		documentInformation.setAuthor("Marcus Cantu");
		documentInformation.setTitle("Practice");
		documentInformation.setCreator("Testing");
		documentInformation.setSubject("Testing Doc");
		
		documentInformation.setKeywords("Creating, a, testing, Pdf");
		document.save(file);
		document.close();
	}

}
