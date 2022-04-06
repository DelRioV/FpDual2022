/**
 * 
 * @author Pablo Salvador Del Rio Vergara -- 1ºDAM -- San Jose
 * 
 * @version 1.0
 * 
 */

package  Actividades2;

public class Programador extends Empleado{
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Programador(){
		super();
	}
	
	public Programador(int lineasDeCodigoPorHora, String lenguajeDominante){
		super();
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
}