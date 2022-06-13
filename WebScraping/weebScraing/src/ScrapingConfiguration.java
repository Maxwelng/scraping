import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;




public class ScrapingConfiguration {
	private String path= "C:\\Users\\maxwe\\Desktop\\WebScraping\\weebScraing\\src\\ScrapingFile.txt";
	private String link= "https://portal.gissonline.com.br/serv_ativ/seleciona_estado.cfm";
	private OutputStreamWriter writer;
	Json json = new Json ();
	
	public ScrapingConfiguration(String[] args, ArrayList<String> lista) {
		configFile(args, lista);
		executar();
	}
	
	private void executar() {
		Scrap.buscar(link, writer);
	}
	
	private void configFile(String[] args, ArrayList<String> lista) {
		
		try {
			
			File arquivo = new File (path);
					
			if (!arquivo.exists()) {
				arquivo.createNewFile();
			}
		 	writer = new OutputStreamWriter(new FileOutputStream(arquivo), "UTF-8");
		 	writer.write("Cod. IBGE Municipio|Atendido Pelo GINFES");	 	
		 	writer.write(json.main(args,lista));
		 	writer.flush();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
