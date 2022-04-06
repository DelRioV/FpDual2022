package ActividadesArray;

public class EUC3 {

	public EUC3() {}

	public int[] comprobar3(int[] nums) {
		int[] copyNums = new int[2];
		if (nums.length % 2 == 0) {
			for (int i = 0; i < 2; i++) {
				copyNums[i] = nums[nums.length / 2 - i];
			}
		} else {
			System.out.println("El arreglo no es par");
		}
		return copyNums;
	}

	public static void main(String[] args) {
		EUC3 cl = new EUC3();
		System.out.println(cl.comprobar3(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
	}

}
