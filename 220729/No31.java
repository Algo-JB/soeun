package july29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No31 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] str = { "\"����Լ��� ������?\"", "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.", "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.", "\"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\""};
		String str1 = "��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.";
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
