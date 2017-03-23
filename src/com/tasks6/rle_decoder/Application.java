package com.tasks6.rle_decoder;

public class Application {
	public static void main(String[] args) {
		if (args.length != 1){
			System.out.println("");
		}
		else if (args[0].length() == 0) {
			System.out.println("");
		} else if (Character.isDigit(args[0].charAt(0))) {
			System.out.println("");
		}
		else {
			StringBuilder res = new StringBuilder();
			res.append(args[0].charAt(0));
			for (int i = 1; i < args[0].length(); i++) {
				if (Character.isDigit(args[0].charAt(i))) {
					int digit = Character.getNumericValue(args[0].charAt(i));
					if (digit == 1 ) {
						System.out.println("");
						return;
					}
					if (i < args[0].length() - 1 &&
							digit < 9 &&
							(args[0].charAt(i - 1) == args[0].charAt(i + 1))) {
						System.out.println("");
						return;
					}
					if (i < args[0].length() - 1 && Character.isDigit(args[0].charAt(i + 1))) {
						System.out.println("");
						return;
					}
						for (int j = 1; j < digit; j++) {
							res.append(args[0].charAt(i - 1));
						}
				}
				else {
					if (args[0].charAt(i) == args[0].charAt(i - 1)) {
						System.out.println("");
						return;
					}
					res.append(args[0].charAt(i));
				}
			}
			System.out.println(res);
		}
	}
}
