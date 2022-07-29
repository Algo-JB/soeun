package july27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 0; i < tc; i++) {
			String[] str = br.readLine().split(" ");
			int floor = Integer.parseInt(str[0]);
			int number = Integer.parseInt(str[1]);
			int cust = Integer.parseInt(str[2]);
			
		}
	}
}
