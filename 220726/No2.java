package july26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		if (num < 7) {
			if(num == 1) {
				result = 1;
			}else {
				result = 2;
			}
		} else {
			int i = 1;
			while ((num - 6 * i) / 6 > 6) {
				if((num - 6 * i) / 6 < 7) {
					result = i;
					break;
				}else {
					i++;
				}
			}
		}
		System.out.println(result);
	}

}
