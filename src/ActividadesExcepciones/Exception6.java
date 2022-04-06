package ActividadesExcepciones;


public class Exception6 {
	public Exception6() {
	}

	public void f() {
		try {
			g();
		} catch (IllegalArgumentException iae) {
			throw new RuntimeException("Llegaste hasta aqu�");
		}
	}

	public void g() {
		throw new IllegalArgumentException("0 es nulo");
	}

	public static void main(String[] args) {
		Exception6 ex = new Exception6();
		ex.f();

	}

}
