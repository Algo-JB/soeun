import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int cnt = 0;
		int cnt2 = 0;
		for (int i = 0; i < num+1; i++) {
			if (i < 100) {
				cnt = i;
			} else {
				String ori = String.valueOf(i);
				int[] arr = new int[3];
				cnt = 99;
				for (int j = 0; j < 3; j++) {
					arr[j] = Integer.parseInt(ori.substring(j, j + 1));
					}
				if (arr[1] - arr[0] == arr[2] - arr[1] ) {
					cnt2++;
				}
			}
		}
		System.out.println(cnt + cnt2);

	}

}
