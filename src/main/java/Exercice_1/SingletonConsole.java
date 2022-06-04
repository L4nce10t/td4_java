package Exercice_1;

public class SingletonConsole implements ILogger {
	private static SingletonConsole logger;

	private SingletonConsole() {
	}

	public static synchronized SingletonConsole getInstance() {
		return logger = new SingletonConsole();
	}

	public void write(Level l, String error) {
		writeToConsole(l, error);
	}

	private void writeToConsole(Level l, String error) {
		System.out.print("[" + l + "]: " + error + "\n");
	}
}
