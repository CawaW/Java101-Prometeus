package com.tasks5.command;

public class AppTest{
	public static void main(String[] args){
		class AppHelp implements Command {
			@Override
			public void execute() {
				System.out.println("Help executed");
			}
		}
		class AppExit implements Command {
			@Override
			public void execute() {
				System.out.println("Goodbye!");
			}
		}
		class AppDate implements Command {
			@Override
			public void execute() {
				System.out.println(System.currentTimeMillis());
			}
		}
		class AppEcho implements Command {
			String echo;
			public AppEcho(String s) {
				this.echo = s;
			}
			@Override
			public void execute() {
				System.out.println(echo);
			}
		}

		if (args.length==0 || args==null){System.out.println("Error");}
		else{
			if (args[0].equals("help")) {
				AppHelp ah = new AppHelp();
				ah.execute();
			}
			if (args[0].equals("exit")) {
				AppExit ae = new AppExit();
				ae.execute();
			}
			if (args[0].equals("date") && args[1].equals("now")) {
				AppDate ad = new AppDate();
				ad.execute();
			} else { System.out.println("Error"); }
			if (args[0].equals("echo")) {
				String echo = "";
				for (int i = 1; i < args.length; i++) {
					if (args[i] != null) {
						echo = echo + args[i] + " ";
					}
				}
				AppEcho ec = new AppEcho(echo);
				ec.execute();
			}
		}
	}
}
