package ActividadesArray;

public class EUC4 {

	public EUC4() {}

	public int[] comprobar4(int[] nums) {
		int[] copyNums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			copyNums[i] = nums[nums.length - 1 - i];
		}
		return copyNums;
	}

	public static void main(String[] args) {
		EUC4 cl = new EUC4();
		System.out.println(cl.comprobar4(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
	}

}
