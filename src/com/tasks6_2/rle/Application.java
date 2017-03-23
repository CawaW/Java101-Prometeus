package com.tastk6.rle;

public class Application {
	public static void main(String[] args) {
		if (args.length != 1){
			System.out.println("Error");
		}
		else if (args[0].length() == 0) {
			System.out.println("");
		}
		else {
			StringBuilder res = new StringBuilder();
			res.append(args[0].charAt(0));
			int count = 1;
			for (int i = 1; i < args[0].length(); i++) {
				if (res.charAt(res.length() - 1) == args[0].charAt(i)) {
					if (count < 9) {count++;}
					else {
						res.append(count);
						count = 1;
						res.append(args[0].charAt(i));
					}
					if (i == args[0].length() - 1) {
						res.append(count);
					}
				} else {
					if (count != 1) res.append(count);
					count = 1;
					res.append(args[0].charAt(i));
				}
			}
			System.out.println(res);
		}
	}
}
