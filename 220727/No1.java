package july27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0; i < tc; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int result = 0;
			
			// È£¼ö
			int l = k+1;
			for(int j = 1; j <= n; j++) {
				// Ãþ
				result += j * l;
				System.out.println(j + " , " + l);
				l--;
			}
			System.out.println(result);
//			System.out.println();
		}

	}

}
