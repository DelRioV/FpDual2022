package ActividadesExcepciones;

public class Exception1  {

	public Exception1(String argu) {
		throw new ArithmeticException(argu);
	}



	public static void main(String[] args) {
		String arg = "Error_050";
		try {
			new Exception1(arg);
		} catch (ArithmeticException z) {
			System.out.println(arg);
		} finally {
			System.out.println("Yo estuve aqui");
		}

	}

}
