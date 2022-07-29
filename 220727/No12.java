package july27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int p = 0; p < tc; p++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int result = 0;
//			 n = 4와  k = 1인 경우
			
//			 n = 4
			int total = 0;
			for(int q = 1; q < n + 1; q++) {
				for (int r = 1; r < k + 1; r++) {
					total += q;
					for (int s = 1; s < q; s++) {
						result += total;
					}
				}
				
			}
			
			
			System.out.println(result);
		}

	}

}
