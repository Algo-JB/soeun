import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split("");
		int[] arr1 = new int[arr.length];
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].charAt(0) < 80) {
				arr1[i] = arr[i].charAt(0) - 56;
				result += arr1[i] / 3;
			} else if (79 < arr[i].charAt(0) & arr[i].charAt(0) <84 ) {
				result += 8;
			} else if (83 < arr[i].charAt(0) & arr[i].charAt(0) <87 ) {
				result += 9;
			} else {
				result += 10;
			}
		
		
	}
	System.out.println(result);
		
	}
}


