package july29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No31 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] str = { "\"재귀함수가 뭔가요?\"", "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.", "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.", "\"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""};
		String str1 = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
		String str0 = "----";
		System.out.println(str1);
		for (int i = 2; i < num + 1; i++) {
			System.out.print(str0);
			for(int j = 1; j < 5; j++) {
				System.out.println(str[j]);
				str0 += str0;
			}
		}

	}

}
