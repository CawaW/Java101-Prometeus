package prometeus_task_1_2;

public class SquareRoot {
	public static void main(String[] args) {
		double a=0;
		double b=10;
		double c=0;

		if (a==0 & b!=0) {
			double x = -c/b;
			if (x == -0.0) x=0.0;
			System.out.println("x1=" + x + "\nx2=" + x);
		}
		else if (((b*b-4*a*c) >= 0) & (a != 0)) {
			System.out.println("x1=" + (-b+(Math.sqrt(b*b-4*a*c)))/(2*a));
			System.out.println("x2=" + (-b-(Math.sqrt(b*b-4*a*c)))/(2*a));
		} else System.out.println("x1=\nx2=");
	}
}
