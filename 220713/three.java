package July13;

import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String b = scanner.next();
		
		
		String b1 = b.substring(0, 1);
		String b2 = b.substring(1, 2);
		String b3 = b.substring(2, 3);
		
		int b11 = Integer.parseInt(b3);
		int b22 = Integer.parseInt(b2);
		int b33 = Integer.parseInt(b1);
		
		int result1 = a * b11;
		int result2 = a * b22;
		int result3 = a * b33;
		int result = result1 + result2* 10 + result3 * 100;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result);
		

	}

}
