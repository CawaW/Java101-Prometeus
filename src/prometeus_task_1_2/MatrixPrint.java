package prometeus_task_1_2;

public class MatrixPrint {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				int num = j + 5*(i-1);
				//System.out.println(i*5+1-i);
				if (j == i | j == (6-i)) System.out.print(" * ");
				else if (num < 10) System.out.print(" " + num + " ");
				else System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}

