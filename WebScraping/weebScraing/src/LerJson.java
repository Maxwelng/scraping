import java.util.ArrayList;

import org.jsoup.select.Elements;

@SuppressWarnings("serial")
public class LerJson extends Elements {
	public String Estado = "";
	public String Municipio = "";
	public int CodIBGE;
	public int cUF;
	
	
	public String getMunicipio() {
		return Municipio;
	}
	
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}


	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	
	public int getCodIBGE() {
		return CodIBGE;
	}

	public int setCodIBGE(int codIBGE) {
		return CodIBGE = codIBGE;
	}

	public int getcUF() {
		return cUF;
	}

	public void setcUF(int cUF) {
		this.cUF = cUF;
	}

	public String toString(int codIBGE2) {
		return "\nEstado=" + Estado + "\nMunicpio=" + Municipio + "\nCodIBGE=" + CodIBGE;
	}
	
	

}