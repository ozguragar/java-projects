package restaurantsystem;

import java.util.ArrayList;

public class Table {

	private int tableNumber;
	private int seats;
	private boolean available;
	private ArrayList<Reservation> reservation;
	private int currentReservations;
	private static int MAX_RESERVATIONS = 4;
	
	
	public Table(int tableNumber, int seats) {
		this.tableNumber = tableNumber;
		this.seats = seats;
		this.reservation = new ArrayList<>();
		this.available = true;
		this.currentReservations = 0;
	}
	
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void addReservation(Reservation reservation) {
		if(currentReservations < MAX_RESERVATIONS) {
			this.currentReservations++;
			this.reservation.add(reservation);
		}
	}
		
	public void removeReservation(Reservation reservation) {
		this.reservation.remove(reservation);
		this.currentReservations--;
	}
	
	public void getReservations() {
		for (Reservation reservation2 : reservation) {
			System.out.println(reservation2.toString());
		}
	}
	
}
	
	
	

