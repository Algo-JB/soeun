package july26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No32 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = Integer.parseInt(br.readLine());
		int len1 = 1;
		int len2 = 3;
		int x = 0;
		int y = 0;
		int cnt = 0;
		int cntY = 0;
		while(x < in) {
			x = x + len1 + (cnt * 4);
			cnt++;
		}
		while (y < in) {
			y = y + len2 + (cntY * 4);
			cntY++;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		int maxNumX = cnt * 2 - 1;
		int dis = x - in;
		int finalX = 1;
		int amu = dis - maxNumX + 1;
		if (dis > maxNumX - 1) {
			for(int j = 0; j < amu; j++) {
				maxNumX--;
			}
			finalX = maxNumX;
		}else {
			for(int i = 0; i < dis; i++) {
				finalX++;
			}
		}
		
		
		int maxNumY = cntY * 2 ;
		System.out.println("maxNumY = " + maxNumY);
		int disY = y - in;
		System.out.println("disY = " + disY);
		int finalY = 1;
		System.out.println("finalY = " + finalY);
		int amuY = disY - maxNumY + 1;
		System.out.println("amuY = " + amuY);
		if (disY > maxNumY - 1) {
			for(int j = 0; j < amuY; j++) {
				maxNumY--;
			}
			finalY = maxNumY;
		}else {
			for(int i = 0; i < disY; i++) {
				finalY++;
			}
		}
		System.out.println(finalX);
		System.out.println(finalY);
	}
}
