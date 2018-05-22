import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class PDF {

	public static void main(String[] args) {
		System.out.println("Creating a PDF");
		
		//Can Also Save to a directory
		//Example:   String fileNameWithDirectory = "C:/directory_directory";
		
		PDDocument document = new PDDocument();
		String fileName = "EmptyPdf.pdf";
		
		try {
			//This is creating multiple pages
			for(int i = 0; i <= 5; i++) {
				PDPage blankPage = new  PDPage();
				document.addPage(blankPage);
			}
			
			document.save(fileName);
			
			System.out.println("You created a file in " + System.getProperty("user.dir") );
			
			document.close();
		} catch (IOException e) {
			//Handling exception 
			System.out.println(e.getMessage());
		}
	}
}
