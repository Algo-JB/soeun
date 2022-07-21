import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < tc; i++) {
			String str = br.readLine();
			String[] answers = new String[str.length() + 1];
			for(int j = 0; j < str.length(); j++) {
				answers[j] = str.substring(j, j+1);
			}
			answers[str.length()] = "K";
			
			int result = 0;
			for(int k = 0; k < answers.length; k++) {
				int l =  0;
				while(answers[k + l].equals("O")) {
					int plus = 1;
					result += plus;
					plus++;
					l++;
				}
			}
			System.out.println(result);
			
		}

	}

}
