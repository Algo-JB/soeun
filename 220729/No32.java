package july29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No32 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] str = { "\"����Լ��� ������?\"", "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.", "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.", "\"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\""};
		String str1 = "��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.";
		String str0 = "";
		System.out.println(str1);
		String strPlus = "----";
		for (int i = 2; i < num + 1; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.print(strPlus);
				for(int k = 0; k < str.length; k++) {
					System.out.println(str[k]);
					str0 += strPlus;
					break;
				}
				
			}
		}

	}

}
