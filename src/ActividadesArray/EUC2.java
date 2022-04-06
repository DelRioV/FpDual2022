package ActividadesArray;

public class EUC2 {

	public EUC2() {}

	public boolean comprobar2(int[] nums) {
		boolean kk = true;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 || nums[i] == 3) {
				kk = false;
			}
		}
		return kk;
	}

	public static void main(String[] args) {
		EUC2 cl = new EUC2();
		System.out.println(cl.comprobar2(new int[] { 1, 2, 3, 4, 5, 6 }));
	}

}
