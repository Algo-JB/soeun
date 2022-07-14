package July13;

import java.util.Scanner;
import java.util.StringTokenizer;

public class two {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		StringTokenizer st = new StringTokenizer(str);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int result1 = (a + b) % c;
		int result2 = ((a % c) + (b % c)) % c;
		int result3 = (a * b) % c;
		int result4 = ((a % c) * (b % c)) % c;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
