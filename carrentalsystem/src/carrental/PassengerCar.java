package carrental;

public class PassengerCar extends Car {

	public PassengerCar(int id, String brand, String model, double dailyRentalPrice) {
		super(id, brand, model, dailyRentalPrice);
	}

	@Override
	public double calculateFuelCost(int distance, double price) {
		return distance * 0.05 * price;
	}

}
