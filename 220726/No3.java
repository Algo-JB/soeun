package july26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = Integer.parseInt(br.readLine());
		int len1 = 1;
		int len2 = 3;
		int x = 0;
		int y = 0;
		int cnt = 0;
		for(int i = 0; i < in; i++) {
			len1 = len1 + 4;
			len2 = len2 + 4;
			while(x < in) {
				x = x + len1;
				cnt++;
			}
		}
//		System.out.println(cnt * 2 - 1);
//		System.out.println(x);
		int dis = x - in;
//		System.out.println(dis);
		int finalX = 1;
		for(int i = 0; i < dis; i++) {
			finalX++;
		}
		System.out.println(finalX);
	}

}
