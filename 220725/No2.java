import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ori = br.readLine();
		StringTokenizer st = new StringTokenizer(ori);
		String ori1 = st.nextToken();
		String ori2 = st.nextToken();
		String[] ori1Arr = ori1.split("");
		String[] ori2Arr = ori2.split("");
		int[] newNum1 = new int[ori1Arr.length];
		int[] newNum2 = new int[ori1Arr.length];
		
		for(int i = 0 ; i < ori1Arr.length ; i ++) {
			int tmp1 = Integer.parseInt(ori1Arr[i]);
			newNum1[ori1Arr.length - 1 - i] = tmp1;
		}
		for(int i = 0 ; i < ori2Arr.length ; i ++) {
			int tmp2 = Integer.parseInt(ori2Arr[i]);
			newNum2[ori2Arr.length - 1 - i] = tmp2;
		}
		int finalNum1 = 0;
		for(int i = 0; i < newNum1.length ; i++) {
			finalNum1 += newNum1[i] * Math.pow(10, newNum1.length-i-1);
		}
		int finalNum2 = 0;
		for(int i = 0; i < newNum2.length ; i++) {
			finalNum2 += newNum2[i] * Math.pow(10, newNum2.length-i-1);
		}
		System.out.println(Math.max(finalNum1, finalNum2));

		
		

	}

}
