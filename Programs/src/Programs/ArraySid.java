package Programs;

public class ArraySid {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 7, 9 };
		int i, j;
		boolean flag = false;
		int len = arr.length;
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				int sum;
				sum = arr[i] + arr[j];

				if (sum == 11) {
					System.out.println("The Number Are:" + arr[i] + " , " + arr[j]);
					System.out.println("Result is True");
					flag = true;
				} else {
					System.out.println("False");
				}

			}
		}

	}

}
