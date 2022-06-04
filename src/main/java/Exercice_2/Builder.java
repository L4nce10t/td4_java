package Exercice_2;

public abstract class Builder {
	public IMaterial material;

	public void startBuilding() {
		System.out.println("I build with " + this.material.getMaterial());
	}

	public void setMaterial(IMaterial m) {
		this.material = m;
	}
}
