package basic.dev;

import java.util.Scanner;

public class MainApp3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào số tháng trong năm (từ 1 đến 12): ");

		int thang = scanner.nextInt();

		scanner.close();

		int soNgay;
		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			soNgay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			soNgay = 30;
			break;
		case 2:
			soNgay = 28;
			break;
		default:
			System.out.println("Số tháng không hợp lệ.");
			return;
		}

		System.out.println("Tháng " + thang + " có " + soNgay + " ngày.");
	}

}