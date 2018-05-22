import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class RemoveExistingFile {

	public static void main(String[] args) throws IOException{
		
		File file = new File("C:/Programming/PdfBox/EmptyPdf.pdf"); 
		PDDocument document = PDDocument.load(file);
		
		//Getting Number of Pages 
		int numberOfPages = document.getNumberOfPages(); 
		System.out.println(numberOfPages);
		//You could implement a check to make sure that they
		//Are not trying to delete a document that doesnt exist 
		
		int pageToRemove = 3; 
		document.removePage(pageToRemove);
		System.out.println("Page" + pageToRemove + "has been removed");
		
		document.save(file);
		document.close();
	}

}
