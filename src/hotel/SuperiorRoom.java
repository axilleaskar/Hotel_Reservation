package hotel;

public class SuperiorRoom extends Room{
	private Amenity amenities;

	public Amenity getAmenities() {
		return amenities;
	}

	public void setAmenities(Amenity amenities) {
		this.amenities = amenities;
	}

	public SuperiorRoom(Amenity amenities) {
		super();
		this.amenities = amenities;
	}

	public SuperiorRoom() {
		super();
	}
	public SuperiorRoom(double price, int floor, int id, String size) {
		super();
		this.id = id;
		this.price = price;
		this.floor = floor;
		this.size = size;
	}
	
	
}
