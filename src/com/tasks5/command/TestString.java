package com.tasks5.command;

public class TestString {
	public static void main(String[] args) {
		System.out.println("ABC".charAt(0));
		String s = "aaa";
		switch (s){
			case "aa" :
				System.out.println("Ok");
				break;
			case "bb" :
				System.out.println("Not Ok");
				break;
			default :
				System.out.println("Sucks!!!");
		}

		char chars[] = {'a', 'b', 'c'};
		String str = new String(chars);
		System.out.println(str);

		String str1="Hello";
		String str2="World";
		String str4="HelloWorld";
		String str3=str1+str2;
		System.out.println(str3==str4);
		System.out.println(str3);

		String str5 = str1.concat(str2);
		System.out.println(str5);
	}
}
