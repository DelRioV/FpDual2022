package ActividadesExcepciones;

public class Exception10_2 extends Exception10_1{
	public Exception10_2() {
		super();
	}
	 @Override
	 public void lanzarExcepciones() {
			throw new ArithmeticException("Error_10_2");
	 }

}
