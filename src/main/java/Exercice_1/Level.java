package Exercice_1;

public enum Level {
	ERROR("ERROR"), WARNING("WARNING"), INFO("INFO"), DEBUG("DEBUG");

	private String levelValue;

	private Level(String l) {
		this.levelValue = l;
	}

	public String getLevelValue() {
		return this.levelValue;
	}
}
