package july26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int i = 1;
		int CSubB = C - B;
		if (CSubB > 0) {
			while(i < 2100000002) {
				if (CSubB * i - A > 0) {
					System.out.println(i);
					break;
				} else {
					i++;
				}
			}
		}else {
			System.out.println("-1");
		}
	

	}

}
