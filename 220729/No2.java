package july29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] fibo = new int[25];
		fibo[0] = 0;
		fibo[1] = 1;
		fibo[2] = 1;
		for(int i = 0; i < num; i++) {
			fibo[i + 2] = fibo[i] + fibo[i + 1];
		}
		
		System.out.println(fibo[num]);

	}

}
