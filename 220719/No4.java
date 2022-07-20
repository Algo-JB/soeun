import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int ori = Integer.parseInt(st.nextToken());
		int newNum = 0;
		int result = ori;
		int cnt = 0;
		if (ori == 0) {
			System.out.println("1");
		}else {
			
			while (ori != newNum) {
				newNum = result;
				int num1 = newNum / 10;
				int num2 = newNum - num1 * 10;
				int total = num1 + num2;
				result = num2 * 10 + total % 10;
				newNum = result;
				cnt++;
				
			}
			System.out.println(cnt);
		}

	}

}
