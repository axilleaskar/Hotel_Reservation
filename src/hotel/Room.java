package hotel;

public class Room {
	
	public double price;
	public int floor;
	public int id;
	public String size;
	
	public Room() {
		
	}
	
	public Room(double price, int floor, int id, String size) {
		this.price = price;
		this.floor = floor;
		this.id = id;
		this.size = size;
	}
	
	public int getId() {
		return id;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
}
