package ActividadesExcepciones;

public class Exception8 {

	public static void main(String[] args) {
		try {
			int[] numeros = new int[2];
			int z = numeros[3];
			System.out.println(z);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Jeje");
		}
	}
}
