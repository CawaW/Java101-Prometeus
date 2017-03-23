package com.tasks5.command;
public class Application {
	public static void main(String[] args){
		if (args == null || args.length == 0 || args.length > 2){System.out.println("Error"); return;}
		else if (args[0].equals("help")) {
				if (args.length == 1) {
					AppHelp ah = new AppHelp();
					ah.execute();
				} else { System.out.println("Error"); return; }
		}
		else if (args[0].equals("exit")) {
				if (args.length == 1){
					AppExit ae = new AppExit();
					ae.execute();
				} else { System.out.println("Error"); return; }
		}
		else if (args[0].equals("date")) {
				if (args.length > 1) {
					if (args[1].equals("now")){
						AppDate ad = new AppDate();
						ad.execute();
					} else { System.out.println("Error"); return; }
				} else { System.out.println("Error"); return; }
		}
		else if (args[0].equals("echo")) {
				if (args.length > 1) {
					String echo = "";
					for (int i = 1; i < args.length; i++) {
						if (args[i] != null) {
							echo = echo + args[i] + " ";
						}
					}
					AppEcho ec = new AppEcho(echo);
					ec.execute();
				} else { System.out.println("Error"); return; }
		}
		else { System.out.println("Error"); return; }
	}
}
