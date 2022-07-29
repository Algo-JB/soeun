package july27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split((" "));
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		int V = Integer.parseInt(s[2]);
		
		int snail = 0;
		int i = 1;
		while (snail < V) {
			snail = A * i - B * (i - 1);
			i++;
		}
		System.out.println(i - 1);
		
	}

}
