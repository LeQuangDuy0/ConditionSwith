package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();

		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();

		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		giaiPhuongTrinhBac2(a, b, c);
	}
	private static void giaiPhuongTrinhBac2(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		switch (kiemTraDelta(delta)) {
		case 1:
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có 2 nghiệm phân biệt:");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			break;
		case 0:
			double x = -b / (2 * a);
			System.out.println("Phương trình có một nghiệm kép:");
			System.out.println("x = " + x);
			break;
		default:
			System.out.println("Phương trình không có nghiệm thực.");
			break;
		}
	}

	private static int kiemTraDelta(double delta) {
		if (delta > 0) {
			return 1; 
		} else if (delta == 0) {
			return 0; 
		} else {
			return -1;
		}
	}

}