package com.inheritance;

public class HasARelation {

	public static void main(String[] args) {
		Car c = new Car("Safari", 2025);
		IO.print(c);
	}

}

class Engine{
	
	protected String type;
	protected int horsePower;
	public Engine(String type, int horsePower) {
		super();
		this.type = type;
		this.horsePower = horsePower;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", horsePower=" + horsePower + "]";
	}
	
}

class Car{
	protected String carName;
	protected int modelName;
	protected final Engine engine;
	
	public Car(String carName, int modelName) {
		this.carName = carName;
		this.modelName = modelName;
		this.engine = new Engine("Battery", 1200);
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", modelName=" + modelName + ", engine=" + engine + "]";
	}
	
}