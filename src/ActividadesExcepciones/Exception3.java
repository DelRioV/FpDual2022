package ActividadesExcepciones;

public class Exception3 {

	public static void main(String[] args) {
		try {
			new Exception2("Error_101");
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
	}

}
