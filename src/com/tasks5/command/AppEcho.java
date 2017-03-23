package com.tasks5.command;
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
