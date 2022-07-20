import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int maxNum = arr[0];
		int maxIdx = 1;
		for (int j = 1; j < 9; j++) {
			if (maxNum < arr[j]) {
				maxNum = arr[j];
				maxIdx = j+1;
			}
		}
		System.out.println(maxNum);
		System.out.println(maxIdx);

	}

}
