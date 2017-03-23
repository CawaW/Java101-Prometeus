package prometeus_task_1_2;

public class ArraySort {
	public static void main(String[] args) {
		int[] array = {30, 2, 10, 4, 6};
		int length = array.length;

		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < length-1; i++) {
				if (array[i] > array[i+1]){
					sorted = false;
					int tmp = array[i+1];
					array[i+1] = array[i];
					array[i] = tmp;
				}
			}
		}

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
