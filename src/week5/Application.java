package week5;

public class Application implements Command {
	public static void main(String[] args) {
		Application a = new Application();
		a.execute();

	}
	@Override
	public void execute() {
		System.out.println("Exec Exec");
	}
}
