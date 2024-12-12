package carrental;

import java.util.ArrayList;

public class CustomerCompany {
	
	private String name;
	private ArrayList<Car> rentedCars;
	
	public CustomerCompany(String name) {
		this.name = name;
		rentedCars = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Car> getRentedCars() {
		return rentedCars;
	}

	public void setRentedCars(ArrayList<Car> rentedCars) {
		this.rentedCars = rentedCars;
	}
	
	public void rentCar(Car car) {
			rentedCars.add(car);
	}
	
	public int getRentalCount() {
		return rentedCars.size();
		
	}
	
		
}
