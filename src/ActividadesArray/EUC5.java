package ActividadesArray;

public class EUC5 {

	public EUC5() {}

	public String[] comprobar5(String[] strings) {
		String[] copyString = new String[strings.length];
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (int i = 0; i < strings.length; i++) {
			for (int z = 0; z < numeros.length; z++) {
				if (strings[i].indexOf(numeros[z]) != -1) {
					copyString[i] = strings[i];
				}
			}

		}
		return copyString;
	}

	public static void main(String[] args) {
		EUC5 cl = new EUC5();
		System.out.println(cl.comprobar5(new String[] { "hola", "ad10s" }));
	}

}
