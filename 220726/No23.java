package july26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No23 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		int i = 1;
		if (num < 8) {
			if(num == 1) {
				result = 1;
			}else {
				result = 2;
			}
		}else {
			while(num / (6 * i) != 0) {
				if(num != 0) {
					num = num - 6 * i;
					i++;
				}else {
					i++;
					break;
				}
			}
			result = i + 1;
		}
		System.out.println(result);
	}

}
