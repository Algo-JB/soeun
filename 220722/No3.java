package july22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
//		String answer = br.readLine();
		String[] arr = str.split("");
		int[] alpha = new int[26];
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = -1;
		}
		for (int i = 0; i <arr.length; i++) {
			int ascII = arr[i].charAt(0)-97;
			if(alpha[ascII] == -1) {
				alpha[ascII] = i;
			}else {
				continue;
			}
		}
		for(int i = 0 ; i < alpha.length; i++) {
			System.out.print(alpha[i]);
			System.out.print(" ");
		}
//		System.out.println();
//		System.out.println(answer);
		
		

	}

}
