package com.abstraction_practice;

public class DownCasting {
	public static void HealthCheckUpCamp(Animal ...animals) {
		for(Animal animal : animals) {
			animal.healthCheckUp();
		}
	}
	public static void main(String[] args) {
			Lion lions [] = {new Lion("Simba"), new Lion("Mufasa"), new Lion("Raka")};
			HealthCheckUpCamp(lions);
	}

}

abstract class Animal{
	  protected String animalName;
	  
	  Animal(String animalName){
		  this.animalName = animalName;
	  }
	  public abstract void healthCheckUp();
}

class Lion extends Animal{
	Lion(String animalName){
		super(animalName);
	}

	@Override
	public void healthCheckUp() {
		IO.println(this.animalName +" Going daily checkup");
		
	}
}

class Elephants extends Animal{
	
	Elephants(String animalName){
		super(animalName);
	}

	@Override
	public void healthCheckUp() {
		IO.println(this.animalName +" Going daily checkup");
		
	}
}