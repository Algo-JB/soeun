import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int numOfStd = Integer.parseInt(st.nextToken());
			int total = 0;
			int[] arrOfStd = new int[numOfStd];
			for(int j = 0; j < numOfStd; j++) {
				arrOfStd[j] = Integer.parseInt(st.nextToken());
				total += arrOfStd[j];
				
			}
			int avg = total / numOfStd;
			int cnt = 0;
			for(int k = 0; k < numOfStd; k++) {
				if (arrOfStd[k] > avg) {
					cnt++;
				}
			}
			double result = (double) cnt /(double) numOfStd * 100;
			System.out.println(String.format("%.3f", result) + "%");
			
		}
		
	}

}
