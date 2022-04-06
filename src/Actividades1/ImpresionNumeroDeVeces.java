/**
 * 
 * @author Pablo Salvador Del Rio Vergara -- 1�DAM -- San Jose
 * 
 * @version 1.0
 * 
 *          Clase que imprime por pantalla un texto introducido segun el numero
 *          de veces introducido
 *
 */
package Actividades1;

public class ImpresionNumeroDeVeces {
	public ImpresionNumeroDeVeces(String texto, int numeroVeces) {
		if (numeroVeces < 0) {
			throw new IllegalArgumentException("Has introducido un numero negativo");
		}
		for (int i = 0; i < numeroVeces; i++) {
			System.out.println(texto);
		}
	}

	public static void main(String[] args){
		new ImpresionNumeroDeVeces("pepe",4);
	}
}
