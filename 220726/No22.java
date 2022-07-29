package july26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int result = 0;
		int i = 1;
		int startNum = 1;
		int endNum = 7;
		while (num > endNum) {
			endNum += (6 * (i + 1));
			i++;
		}

		if (num == 1) {
			result = 1;
		} else {
			result = i + 1;
		}
		System.out.println(result);
	}

}
