package ActividadesExcepciones;

public class Exception9 {

	public static void main(String[] args) {
		int i = 50;
		int[] numeros = new int[45];
		int a = numeros.length;
		while (a >= (numeros.length - 1)) {
			try {
				System.out.println(i);
				a = numeros[i];
				System.out.println("Ya sal�");
			} catch (Exception ex) {
				i--;
			}
		}
	}

}
