package july27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split((" "));
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int V = Integer.parseInt(s[2]);
		
		int day = (V -  B) / (A - B);
		
		if ((V - B) % (A - B) != 0) {
			day++;
		}
		System.out.println(day);
		
	}

}
