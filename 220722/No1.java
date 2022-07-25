package july22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ch = br.readLine();
		
		int ascII = ch.charAt(0);
		
		System.out.println(ascII);
		
		

	}

}
