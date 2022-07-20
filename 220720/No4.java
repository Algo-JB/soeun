import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr1 = new int[10];
		int[] arr2 = new int[42];
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
			arr2[arr1[i] % 42]++;
		}
		for (int j = 0; j < 42; j++) {
			if (arr2[j] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
