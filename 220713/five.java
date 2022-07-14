import java.util.Scanner;

import java.util.StringTokenizer;

public class five {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		StringTokenizer st = new StringTokenizer(str);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		if (a > b){
			System.out.println(">");
		} else if (a < b){
			System.out.println("<");
		}else{
			System.out.println("==");
		}


	}

}
