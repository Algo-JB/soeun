import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ori = br.readLine();
		String str = ori.trim();
		if(str.length() != 0) {
			String[] arr = str.split(" ");
			System.out.println(arr.length);
			
		}else {
			System.out.println("0");
		}

	}

}
