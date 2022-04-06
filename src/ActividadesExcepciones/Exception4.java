package ActividadesExcepciones;

public class Exception4 {

	public static void main(String[] args) {
		try{
			@SuppressWarnings("unused")
			Exception1 ex = null;
		} catch(NullPointerException nu){
			nu.printStackTrace();
		}
	}
}
