public class Main {

	public static void main(String[] args) {
		int[] arr = new int[10000];
		for (int i = 0; i < 10000; i++) {
			arr[i] = i;
		}
		int result = 0;
		for (int j = 0; j < 10000; j++) {
			if (j < 10000) {
				String ori = String.valueOf(j);
				int ori2 = Integer.valueOf(ori);
				result = ori2;
				for (int k = 0; k < ori.length(); k++) {
					String mid1 = ori.substring(k, k + 1);
					int mid2 = Integer.valueOf(mid1);
					
					result += mid2;
				}
				for(int l = 0; l < 10000; l++) {
					if(result == arr[l]) {
						arr[l] = 0;
					}
				}

			}
			if (arr[j] != 0) {
				System.out.println(arr[j]);
			}
		}
	}

}
