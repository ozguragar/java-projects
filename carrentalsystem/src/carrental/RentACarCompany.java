package carrental;

import java.util.ArrayList;

public class RentACarCompany {
	
	private String name;
	private ArrayList<Car> carList;
	private ArrayList<CustomerCompany> customerList;
	
	public RentACarCompany(String name) {
		super();
		this.name = name;
		carList = new ArrayList<>();
		customerList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Car> getCarList() {
		return carList;
	}

	public void setCarList(ArrayList<Car> carList) {
		this.carList = carList;
	}

	public ArrayList<CustomerCompany> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<CustomerCompany> customerList) {
		this.customerList = customerList;
	}
	
	public void rentCar(CustomerCompany customer, Car car) {
		if(!customerList.contains(customer))
			customerList.add(customer);
		
		customer.getRentedCars().add(car);
		
	}
	
	public String mostFrequentCustomer() {
		int most = 0;
		String name = null;
		for (CustomerCompany customer : customerList) {
			if(customer.getRentalCount() > most) {
				most = customer.getRentalCount();
				name = customer.getName();
			}
				
		}		
		return name;
	}
	
	public void calculateTotalCosts(int rentalDays) {
		double totalCost;
		for (CustomerCompany customer : customerList) {
			totalCost = 0;
			for (Car car : customer.getRentedCars()) {
				totalCost += car.dailyRentalPrice * rentalDays;
			}
			System.out.printf("%s's total cost for %d days: %.1f TL \n", customer.getName(), rentalDays, totalCost);
		}
	}
	
	
	
}
