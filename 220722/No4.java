package july22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tc; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int num = Integer.parseInt(st.nextToken());
			String str2 = st.nextToken();
			String[] result = str2.split("");
			
			for(int j = 0; j < result.length; j++) {
				for(int k = 0; k < num; k++) {
					System.out.print(result[j]);
				}
			}
			
			System.out.println();
		}
	}

}
