package july26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No31 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = Integer.parseInt(br.readLine());
		int len1 = 1;
		int len2 = 3;
		int x = 0;
		int y = 0;
		int cnt = 0;
		while(x < in) {
			x = x + len1 + (cnt * 4);
			cnt++;
		}
		int maxNum = cnt * 2 - 1;
		System.out.println("maxNum " + maxNum);
		System.out.println("x " + x);
		int dis = x - in;
		System.out.println("dis " + dis);
		int finalX = 1;
		System.out.println("dis-maxNum" + (dis-maxNum + 1));
		int amu = dis - maxNum + 1;
		if (dis > maxNum - 1) {
			for(int j = 0; j < amu; j++) {
				maxNum--;
			}
			finalX = maxNum;
		}else {
			for(int i = 0; i < dis; i++) {
				finalX++;
			}
		}
		System.out.println("finalX " + finalX);
	}
}
