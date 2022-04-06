package ActividadesExcepciones;

public class Exception5 {

	public Exception5() {
	}

	public void f() {
		try {
			g();
		} catch (IllegalArgumentException iae) {
			throw new IndexOutOfBoundsException("Llegaste hasta aqu�");
		}
	}

	public void g() {
		throw new IllegalArgumentException("0 es nulo");
	}

	public static void main(String[] args) {
		Exception5 ex = new Exception5();
		ex.f();
	}
}
