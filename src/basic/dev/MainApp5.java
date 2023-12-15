package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập độ dài cạnh a: ");
		double a = scanner.nextDouble();

		System.out.print("Nhập độ dài cạnh b: ");
		double b = scanner.nextDouble();

		System.out.print("Nhập độ dài cạnh c: ");
		double c = scanner.nextDouble();


		switch (kiemTraTamGiac(a, b, c)) {
		case 1:
			System.out.println("Ba số " + a + ", " + b + ", " + c + " có thể là cạnh của một tam giác.");
			break;
		case 0:
			System.out.println("Ba số " + a + ", " + b + ", " + c + " không thể là cạnh của một tam giác.");
			break;
		default:
			System.out.println("Giá trị không hợp lệ.");
			break;
		}
	}

	private static int kiemTraTamGiac(double a, double b, double c) {
		if (a > 0 && b > 0 && c > 0) {
			if ((a + b > c) && (b + c > a) && (c + a > b)) {
				return 1; 
			} else {
				return 0; 
			}
		} else {
			return -1;
		}
	}

}