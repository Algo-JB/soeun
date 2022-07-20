import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int result = A * B * C;
		String result2 = String.valueOf(result); 
		int newNum = 0;
		int result3 = 0;
		int[] arr = new int[10];
		
		for (int i = 0; i < result2.length(); i++) {
			newNum = Integer.parseInt(result2); 
			result3 = (int) (newNum / Math.pow(10, i) % 10);
			arr[result3]++;
		}
		for (int j = 0; j < 10; j++) {
			System.out.println(arr[j]);
		}
	}

}
