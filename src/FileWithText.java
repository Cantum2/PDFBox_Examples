import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class FileWithText {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//Loading existing doc
		File file = new File("C:/Programming/PdfBox/EmptyPdf.pdf"); 
		PDDocument document = PDDocument.load(file); 
		
		//Retrieving Specific page
		PDPage page = document.getPage(0); 
		PDPageContentStream contentStream = new PDPageContentStream(document, page);
		
		contentStream.beginText();
		
		//Setting font and size
		contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
		
		//Setting position 
		contentStream.newLineAtOffset(25, 500);
		
		String text = "Testing adding useful information into the document"; 
		
		//Adding text to document
		contentStream.showText(text);
		
		contentStream.endText();
		contentStream.close();
		
		System.out.println("Text added");
		
		document.save(file);
		document.close();
		
	}

}
