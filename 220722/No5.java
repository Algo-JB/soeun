package july22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No51 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ori = br.readLine();
		String[] arr = ori.split("");
		int[] cnt = new int[26];
		int maxIdx = 0;
		
		for (int i = 0; i < arr.length ; i++) {
			int num = arr[i].toUpperCase().charAt(0) - 65;
			cnt[num]++;
		}
		for(int j = 0; j < cnt.length ;j++) {
			if (cnt[maxIdx] < cnt[j]) {
				maxIdx = j;
			}
		}
		int same = 0;
		for(int k = 0; k < cnt.length; k++) {
			if(cnt[k] == cnt[maxIdx]) {
				same++;
			}
		}
		if(same == 1) {
			char ch = (char)(maxIdx + 65);
			System.out.println(ch);
		}else { 
			System.out.println("?");
		}
		
		
		
	}

}
