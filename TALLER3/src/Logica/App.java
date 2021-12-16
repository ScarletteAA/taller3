package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
	public static void leerLocalizacion() throws FileNotFoundException{
		Scanner arch = new Scanner(new File("localizacion.txt"));
		while(arch.hasNext()){
			String linea = arch.nextLine();
			String nombre = linea;
		}
		arch.close();
		}


public static void leerEntregas() {
	Scanner arch = new Scanner(new File("entregas.txt"));
	while(arch.hasNext()) {
		String linea = arch.nextLine();
		String [] partes = linea.split(",");
		String codigo = partes[0];
		String tipo = partes[1];
		String rutRemitente = partes[2];
		String rutDestinatario = partes[3];
		if(tipo.equalsIgnoreCase("D")) {
			double pesoGramos = partes[4];
			double grosorMM = partes[5];
		}
		else if(tipo.equalsIgnoreCase("E")) {
			double pesoGramos = partes[4];
			double largoCM = partes[5];
			double anchoCM = partes[6];
			double profundidadCM = partes[7];
		}
		else if(tipo.equalsIgnoreCase("V")) {
			double material = partes[4];
			double pesoGramos = partes[5];
		}
	}
	arch.close();
}

}
