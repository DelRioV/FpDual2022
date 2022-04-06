/**
 * 
 * @author Pablo Salvador Del Rio Vergara -- 1ºDAM -- San Jose
 * 
 * @version 1.0
 * 
 *          Clase que muestra por pantalla un texto de manera que quede "Hola
 *          (texto)", el texto se pone la primera letra en mayúsculas
 */
package  Actividades1;

public class ImpresionPorPantalla {

	public ImpresionPorPantalla(String texto) {
		String primeraLetra = texto.substring(0, 1);
		String loDemas = texto.substring(1, texto.length());

		primeraLetra = primeraLetra.toUpperCase();
		texto = primeraLetra + loDemas;
		System.out.println("Hola " + texto);
	}

	public static void main(String[] args){
	new ImpresionPorPantalla("mundo");
	}

}
