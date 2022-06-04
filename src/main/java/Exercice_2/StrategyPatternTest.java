package Exercice_2;

public class StrategyPatternTest {
	public static void main(String[] args) {
		Builder builder = new AmericanHouseBuilder();
		builder.startBuilding();

		builder.setMaterial(new RedBrick());
		builder.startBuilding();
	}
}
