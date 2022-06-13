import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.parser.ParseException;


public class Main {
		public static void main (String[] args, ArrayList<String> lista) throws IOException, ParseException {
			new ScrapingConfiguration(args, lista);
			//new Scrap();
			//Json.main(args);
		}
		
}
