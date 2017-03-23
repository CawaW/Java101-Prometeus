package com.tasks5.command;
class AppDate implements Command {
	@Override
	public void execute() {
		System.out.println(System.currentTimeMillis());
	}
}
