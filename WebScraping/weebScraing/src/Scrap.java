import java.io.OutputStreamWriter;
//import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;


public class Scrap {
	public static void buscar(String link, OutputStreamWriter writer) {
		Document doc = null;
		
		try {
			doc = Jsoup.connect(link).get();
			
		}catch (Exception e) {
			System.out.println("Site indisponível ou falha na requisição");			
		}
		
		for (Element element: doc.getElementsByTag("option")) {
			String estado = element.getElementsByTag("option").text();			
			//String array []= estado.contains();
			//boolean array= estado.contains(estado);
			System.out.println(estado);
		}
		
		
		
}
}

