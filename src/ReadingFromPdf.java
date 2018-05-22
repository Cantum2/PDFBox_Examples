import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingFromPdf {

	public static void main(String[] args) throws IOException{
		
		//Loading Existing Doc
		File file = new File("C:/Programming/PdfBox/EmptyPdf.pdf"); 
		PDDocument document = PDDocument.load(file); 
		
		//Creating PDFStripper object
		PDFTextStripper pdfStripper = new PDFTextStripper(); 
		
		//Stripping and saving existing text
		String text = pdfStripper.getText(document); 
		System.out.println(text);
		document.close();
	}

}
