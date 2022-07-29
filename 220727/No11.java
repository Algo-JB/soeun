package july27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 0; i < tc; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int result = 0;
			
			// È£¼ö
			for (int l = k; 0 < l ;l--) {
				// Ãþ
				for(int j = 1; j <= n; j++) {
					System.out.println(j + " , " + l);
					result += j * l;
				}
			}
			System.out.println(result);
//			System.out.println();
		}

	}

}
