import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		double total = 0;
		double result;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int maxNum = arr[0];
		for (int j = 0; j < N; j++) {
			if (maxNum < arr[j]) {
				maxNum = arr[j];
			}
		}
		for (int k = 0; k < N; k++) {
			double newScore =(double) arr[k] / maxNum * 100;
			total += newScore;
		}
		result = total / N;
		System.out.println(result);
		
		
	}

}
