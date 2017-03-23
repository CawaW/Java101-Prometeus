package prometeus_task_1_2;

public class BinarySearch {
	public static void main(String[] args) {
		int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		int numberToFind = 11;
		int $const_goto;

		for (int i = 0; i < data.length; i++) {
			if (data[i] == numberToFind) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}
