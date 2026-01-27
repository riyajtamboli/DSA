package rt.driver_scenario_elc;

import rt.driver_scenario_blc.Car;
import rt.driver_scenario_blc.Driver;

public class UpdateDriverScenario {

	public static void main(String[] args) {
		Driver driver = new Driver("Scott", 30);
		Car car = new Car("Hyundai", "Creta", 2025, driver);
		
		Car newCar= new Car(car);
		Driver newDriver = new Driver("Alen", 35);
		car.changeDriver(newDriver);
		IO.println(car);
		IO.println(newCar);
	}

}
