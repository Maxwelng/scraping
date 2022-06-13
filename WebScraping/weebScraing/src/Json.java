import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json {
	
	@SuppressWarnings("resource")
	public  ArrayList<String> main(ArrayList <String>lista) throws FileNotFoundException, IOException, ParseException {
		
		ArrayList<String> EstadoAlagoas = new ArrayList <>();	
		ArrayList<String> EstadoAmapa = new ArrayList <>();	
		ArrayList<String> EstadoAmazonas = new ArrayList <>();	
		ArrayList<String> EstadoBahia = new ArrayList <>();	
		ArrayList<String> EstadoCeara = new ArrayList <>();	
		ArrayList<String> EstadoDistritoFederal = new ArrayList <>();	
		ArrayList<String> EstadoES = new ArrayList <>();	
		ArrayList<String> EstadoGO = new ArrayList <>();	
		ArrayList<String> EstadoMA = new ArrayList <>();	
		ArrayList<String> EstadoMT = new ArrayList <>();	
		ArrayList<String> EstadoMS = new ArrayList <>();	
		ArrayList<String> EstadoMG = new ArrayList <>();	
		ArrayList<String> EstadoPA = new ArrayList <>();	
		ArrayList<String> EstadoPB = new ArrayList <>();	
		ArrayList<String> EstadoPR = new ArrayList <>();	
		ArrayList<String> EstadoPE = new ArrayList <>();	
		ArrayList<String> EstadoPI = new ArrayList <>();	
		ArrayList<String> EstadoRJ = new ArrayList <>();	
		ArrayList<String> EstadoRN = new ArrayList <>();	
		ArrayList<String> EstadoRS = new ArrayList <>();	
		ArrayList<String> EstadoRO = new ArrayList <>();	
		ArrayList<String> EstadoRR = new ArrayList <>();	
		ArrayList<String> EstadoSC = new ArrayList <>();	
		ArrayList<String> EstadoSP = new ArrayList <>();	
		ArrayList<String> EstadoSE = new ArrayList <>();	
		ArrayList<String> EstadoTO = new ArrayList <>();	
		ArrayList<String> EstadoAcre = new ArrayList <>();
		LerJson ler = new LerJson();
		JSONObject Object;
		JSONParser parser = new JSONParser();
		lista = new ArrayList<>();	
		try {
			
			
			JSONArray arrays = (JSONArray) parser.parse( new InputStreamReader(new FileInputStream("C:\\Users\\maxwe\\Downloads\\municipiosJSONn.json"), "UTF-8"));

			for(Object o :arrays ){	
				Object = (JSONObject) o;
				String Estado = (String) Object.get("Estado".toString());
				String Municipio = (String) Object.get("Municipio").toString();
				int CodIBGE = (int) Double.parseDouble(Object.get("CodIBGE").toString());
				ler.setEstado(Estado);				
				ler.setMunicipio(Municipio);
				ler.setCodIBGE(CodIBGE);	
				lista.add(ler.toString(CodIBGE));	
				
			Iterator<String> it = lista.iterator();
			
				while (it.hasNext()) {
					if(Estado.contains("Acre")){
						EstadoAcre = lista;
  						it.next();
						System.out.println(EstadoAcre);	
						
					} 
					it.remove(); 
					if (Estado.contains("Alagoas")) {			
						EstadoAlagoas = lista;
						it.next();	
						
						System.out.println(EstadoAlagoas);
					}					
				}							
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException ex) {
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
	}
	return lista;	
	}
				
}
