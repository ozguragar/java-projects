package restaurantsystem;

import java.util.ArrayList;

public class Customer {
	
	private String name;
	private String phoneNumber;
	private ArrayList<Reservation> reservation;
	
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.reservation = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ArrayList<Reservation> getReservation() {
		return reservation;
	}
	public void setReservation(ArrayList<Reservation> reservation) {
		this.reservation = reservation;
	}
	
	public void addReservation(Reservation reservation) {
		this.reservation.add(reservation);
	}
	
	public void removeReservation(Reservation reservation) {
		this.reservation.remove(reservation);
	}
	
	public void listReservation() {
		for (Reservation reservation2 : reservation) {
			System.out.println(reservation2);
		}
	}

}
