/**
 * 
 * @author Pablo Salvador Del Rio Vergara -- 1�DAM -- San Jose
 * 
 * @version 1.0
 * 
 *          Clase que recibe una array de tipo String y junta todos los textos
 *          en una variable
 * 
 */
package Actividades1;

public class ImpresionParametros {
	public ImpresionParametros(String[] todosTextos) {
		String juntosTextos = "";
		for (String texto : todosTextos) {
			juntosTextos += texto;
		}
		System.out.println(juntosTextos);
	}

	public static void main(String[] args){
		new ImpresionParametros(new String[]{"hola","adios","sue�o"});
	}
}
