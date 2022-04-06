package ActividadesExcepciones;

@SuppressWarnings("serial")
public class Exception2 extends Throwable {
	private String arg;

	public Exception2(String argu) {
		arg = argu;
		throw new ArithmeticException(argu);
	}

	public void imprimirArgumento() {
		System.out.println(arg);
	}

	public String getArg() {
		return arg;
	}

	public static void main(String[] args) {
		try {
			new Exception2("Error_101");
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
	}

}
