package july22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int total = 0;
		String[] arr = str.split("");
		
		for(int i = 0 ; i < num1 ; i++) {
			total += Integer.parseInt(arr[i]);
		}
		
		System.out.println(total);
	}

}
