package Exercice_1;

public class StaticLoggerTest {
	public static void main(String[] args) {
		int i;

		for (i = 0; i < 10; i++) {
			StaticLogger.write(Level.ERROR, "Votre CB ne marche plus!");

			StaticLogger.write(Level.WARNING, "Vous êtes désormais un voleur!");

			StaticLogger.write(Level.INFO, "Vous êtes à decouvert");
			
			StaticLogger.write(Level.DEBUG, "Vous argent est revenu!");
		}
	}
}
