package hotel;

public class Amenity {
	
	public int ucode;
	public String category;
	public String description;
	public double price;
	
	
	public Amenity() {
		
	}
	
	public Amenity(int ucode, String category, String description, double price) {
		super();
		this.ucode = ucode;
		this.category = category;
		this.description = description;
		this.price = price;
	}
	public int getUcode() {
		return ucode;
	}
	public void setUcode(int ucode) {
		this.ucode = ucode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
