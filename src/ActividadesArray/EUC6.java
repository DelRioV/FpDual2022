package paquete;

import java.util.ArrayList;

public class EUC6 {

	public EUC6() {
	}

	public boolean comprobar6_1(ArrayList<Integer> nums) {
		boolean kk = false;
		if (nums.get(0) == 6 || nums.get(nums.size() - 1) == 6) {
			kk = true;
		}
		return kk;
	}

	public boolean comprobar6_2(ArrayList<Integer> nums) {
		boolean kk = true;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) == 2 || nums.get(i) == 3) {
				kk = false;
			}
		}
		return kk;
	}

	public ArrayList<Integer> comprobar6_3(ArrayList<Integer> nums) {
		ArrayList<Integer> copyNums = new ArrayList<>();
		if (nums.size() % 2 == 0) {
			for (int i = 0; i < 2; i++) {
				copyNums.add(nums.get(nums.size() / 2 - i));
			}
		} else {
			System.out.println("El arreglo no es par");
		}
		return copyNums;
	}

	public ArrayList<Integer> comprobar6_4(ArrayList<Integer> nums) {
		ArrayList<Integer> copyNums = new ArrayList<>();
		for (int i = nums.size() - 1; i >= 0; i--) {
			copyNums.add(nums.get(i));
		}
		return copyNums;
	}

	public ArrayList<String> comprobar6_5(ArrayList<String> strings) {
		ArrayList<String> copyString = new ArrayList<>();
		ArrayList<String> numeros = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numeros.add(String.valueOf(i));
		}
		for (int i = 0; i < strings.size(); i++) {
			for (int z = 0; z < numeros.size(); z++) {
				if (strings.get(i).indexOf(numeros.get(z)) != -1) {
					copyString.add(strings.get(i));
				}
			}

		}
		return copyString;
	}

	public static void main(String[] args) {
		EUC6 cl = new EUC6();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < 7; i++) {
			nums.add(i);
			strings.add("hola" + i);
		}
		System.out.println(cl.comprobar6_1(nums));
		System.out.println(cl.comprobar6_2(nums));
		System.out.println(cl.comprobar6_3(nums));
		System.out.println(cl.comprobar6_4(nums));
		System.out.println(cl.comprobar6_5(strings));

	}

}
