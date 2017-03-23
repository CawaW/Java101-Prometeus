package week5;

class Test{
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.test(5, 5));
		System.out.println(Test.test(1.0, 1.0));
		System.out.println(Test.test(1, 1.0));
	}
	int test(int i, int d) {
		return 0;
	}

	static int test(int i, double d) {
		return 10;
	}

	static double test(double i, double d) {
		return 100;
	}
}