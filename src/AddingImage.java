import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class AddingImage {

	public static void main(String[] args) throws IOException{
		//Loading Pdf
		File file = new File("C:/Programming/PdfBox/EmptyPdf.pdf"); 
		PDDocument document = PDDocument.load(file);  
		
		//Loading A page
		PDPage page = document.getPage(0); 
		
		//Adding image to page 
		PDImageXObject pdImage = PDImageXObject.createFromFile("c:/pictures/rocket.jpg", document); 
		
		PDPageContentStream content = new PDPageContentStream(document, page); 
		
		//Putting image in 
		content.drawImage(pdImage, 70,250);
		
		System.out.println("Image inserted");
		
		content.close();
		
		document.save(file);
		document.close();
	}

}
