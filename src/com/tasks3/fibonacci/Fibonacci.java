package com.tasks3.fibonacci;

public class Fibonacci {
	private long a = 0;
	private long b = 1;

	public Fibonacci() {
		this.a = a;
		this.b = b;
	}
	public long getNumber(int position){
		a = 0;
		b = 1;
		if (position < 1) return -1;
		if (position == 1) return 1;
		long tmp;
		for (int i = 2; i < position; i++) {
			tmp = a + b;
			a = b;
			b = tmp;
			if (b > (9223372036854775807L / 2)) return -1;
		}
		return a + b;
	}

}
