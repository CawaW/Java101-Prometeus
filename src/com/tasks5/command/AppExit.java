package com.tasks5.command;
class AppExit implements Command {
	@Override
	public void execute() {
		System.out.println("Goodbye!");
	}
}
