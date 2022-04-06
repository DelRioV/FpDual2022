/**
 * 
 * @author Pablo Salvador Del Rio Vergara -- 1�DAM -- San Jose
 * 
 * @version 1.0
 * 
 *          Clase que recoge dos parametros y los utiliza como si fuese en
 *          lenguaje HTML
 * 
 */
package Actividades1;

public class EtiquetaHTML {
	public EtiquetaHTML(String tagTexto, String texto) {
		System.out.println("<" + tagTexto + ">" + texto + "<\\" + tagTexto + ">");
	}

	public static void main(String[] args){
		new EtiquetaHTML("h1","Bienvenido");
	}
}
