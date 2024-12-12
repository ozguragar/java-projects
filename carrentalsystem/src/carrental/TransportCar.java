package carrental;

public class TransportCar extends Car {
	
	private int passengerCapacity;
	
	public TransportCar(int id, String brand, String model, double dailyRentalPrice, int passengerCapacity) {
		super(id, brand, model, dailyRentalPrice);
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public double calculateFuelCost(int distance, double price) {
		return distance * 0.2 * price;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}


	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

}
