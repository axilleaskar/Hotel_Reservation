package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
    public int rId;
	public Room room;
	public Amenity amenity;
	public Client client;
	public String checkIn;
	public String checkOut;
	public double discount;
	
    
	
	public Reservation() {
		
	}
	
	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public Amenity getAmenity() {
		return amenity;
	}
	public void setAmenity(Amenity amenity) {
		this.amenity = amenity;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}




	public Reservation(int rId, Room room, Amenity amenity, Client client, String checkIn, String checkOut, double discount) {
		super();
		this.rId = rId;
		this.room = room;
		this.amenity = amenity;
		this.client = client;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.discount = discount;
	}
	
    
    
	
}
