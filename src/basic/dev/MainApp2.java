package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập một số nguyên: ");
	        int n = scanner.nextInt();
	        scanner.close();
	        switch (kiemTraChiaHet(n)) {
	            case 3:
	                System.out.println("Số nguyên " + n + " chia hết cho 3.");
	                break;
	            case 5:
	                System.out.println("Số nguyên " + n + " chia hết cho 5.");
	                break;
	            default:
	                System.out.println("Số nguyên " + n + " không chia hết cho 3 hoặc 5.");
	                break;
	        }
	    }
	    private static int kiemTraChiaHet(int n) {
	        if (n % 3 == 0) {
	            return 3;
	        } else if (n % 5 == 0) {
	            return 5; 
	        } else {
	            return 0;
	        }
	    }
	}
