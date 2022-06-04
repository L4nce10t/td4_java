package Exercice_1;

public class SingletonLoggerTest {
	public static void main(String[] args) {
		int j;
		ILogger file = SingletonFileLogger.getInstance();
		ILogger console = SingletonConsole.getInstance();

		for (j = 0; j < 10; j++) {
			file.write(Level.ERROR, "Votre CB ne marche plus!");
			console.write(Level.ERROR, "Votre CB ne marche plus!");

			file.write(Level.WARNING, "Vous êtes désormais un voleur!");
			console.write(Level.WARNING, "Vous êtes désormais un voleur!");

			file.write(Level.INFO, "Vous êtes à decouvert");
			console.write(Level.INFO, "Vous êtes à decouvert");

			file.write(Level.DEBUG, "Vous argent est revenu!");
			console.write(Level.DEBUG, "Vous argent est revenu!");
		}
	}
}
