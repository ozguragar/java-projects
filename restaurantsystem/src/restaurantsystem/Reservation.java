package restaurantsystem;

public class Reservation {
	
	private Customer customer;
	private String reservationTime;
	
	
	public Reservation(Customer customer, String reservationTime) {
		this.customer = customer;
		this.reservationTime = reservationTime;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}
	@Override
	public String toString() {
		return "Reservation [customer=" + customer.getName() + ", reservationTime=" + reservationTime + "]";
	}
	
	
}
