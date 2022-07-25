import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split("");
		int cnt = 0;
		// c=, c-, dz=, d-, lj, nj, s=, z=
		for (int i = 0; i < arr.length-2; i++) {
			char ch0 = arr[i].charAt(0);
			char ch1 = arr[i+1].charAt(0);
			char ch2 = arr[i+2].charAt(0);
			if(ch0 == 'd' & ch1 =='z' & ch2 == '=') {
				arr[i] = "p";
				arr[i+1] = "0";
				arr[i+2] = "0";
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			char ch0 = arr[i].charAt(0);
			char ch1 = arr[i+1].charAt(0);
			if(ch0 == 'c') {
				if(ch1 == '=' | ch1 =='-') {
					arr[i] = "p";
					arr[i+1] = "0";
				}
			} else if(ch0 == 'd') {
				if(ch1 == '-') {
					arr[i] = "p";
					arr[i+1] = "0";
				}
			} else if(ch1 == 'j') {
				if (ch0 == 'l' | ch0 == 'n') {
					arr[i] = "p";
					arr[i+1] = "0";
				}
				
			} else if(ch1 == '=') {
				if(ch0 == 's' | ch0 == 'z') {
					arr[i] = "p";
					arr[i+1] = "0";
				}
				
			} 
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != "0") {
				cnt++;
			}
		}
		System.out.println(cnt);	
		}
		

}
