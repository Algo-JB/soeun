package template;

public class No5 {
    public static void main(String[] args) {
        
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());
		
		if (num1 == num2 & num2 == num3) {
			result = 10000 + 1000 * num1;
		} else if(num1 == num2) {
			result = 1000 + num1 * 100;
		} else if(num2 == num3) {
			result = 1000 + num2 * 100;
		} else if(num1 == num3) {
			result = 1000 + num1 * 100;
		} else {
			int bigger = Math.max(num1, num2);
			int biggest = Math.max(bigger, num3);
			result = biggest * 100;
		}
		
		System.out.println(result);
		
	}

}
