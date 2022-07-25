import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt1 = 0;
		for (int i = 0; i < num; i++) {
			String str = br.readLine();
			String[] arr = str.split("");
			int[] cnt = new int[26];
			for(int j = 0; j < arr.length; j++) {
				int tmp = arr[j].charAt(0) - 97;
				if(cnt[tmp] == 0) {
					cnt[tmp]++;
				}else {
					int befTmp = arr[j-1].charAt(0) - 97;
					if(tmp != befTmp) {
						cnt1++;
						break;
					}else {
						cnt[tmp]++;
					}
				}
			}
		}
		System.out.println(num-cnt1);
		
		
	}

}
