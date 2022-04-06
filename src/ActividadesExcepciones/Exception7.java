package ActividadesExcepciones;

public class Exception7 {
	public Exception7() {
	}

	public void lanzarExcepciones(int i) {
		if (i == 0) {
			throw new ArithmeticException("A");
		} else if (i == 1) {
			throw new IllegalArgumentException("I");
		} else {
			throw new IndexOutOfBoundsException(".-.");
		}
	}

	public static void main(String[] args) {
		try {
			Exception7 exz = new Exception7();
			exz.lanzarExcepciones(0);
		} catch (Exception ex) {
			System.out.println("Una excepcion ha sido cazada");
		}
	}
}
