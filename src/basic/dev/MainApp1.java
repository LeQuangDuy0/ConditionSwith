package basic.dev;

import java.util.Scanner;

public class MainApp1 {
	/**
	 * bai 10.1
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số nguyên: ");
		int soNguyen = sc.nextInt();
		switch (ktra(soNguyen)) {
		case 1:
			System.out.println("Số nguyên đã nhập là số dương.");
			break;
		case -1:
			System.out.println("Số nguyên đã nhập là số âm.");
			break;
		default:
			System.out.println("Số nguyên đã nhập là số 0.");
			break;
		}
	}

	private static int ktra(int soNguyen) {
		if (soNguyen > 0) {
			return 1;
		} else if (soNguyen < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}