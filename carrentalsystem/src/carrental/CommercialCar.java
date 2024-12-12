package carrental;

public class CommercialCar extends Car {
	

	public CommercialCar(int id, String brand, String model, double dailyRentalPrice) {
		super(id, brand, model, dailyRentalPrice);
	}

	@Override
	public double calculateFuelCost(int distance, double price) {
		return distance * 0.1 * price;
	}

}
