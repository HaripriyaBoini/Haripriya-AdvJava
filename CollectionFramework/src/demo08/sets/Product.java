package demo08.sets;

public class Product {

	private int id;
	private String brand;
	private String Variant;
	public Product(int id, String brand, String variant) {
		super();
		this.id = id;
		this.brand = brand;
		Variant = variant;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVariant() {
		return Variant;
	}
	public void setVariant(String variant) {
		Variant = variant;
	}
	@Override
	public String toString() {
		return "\n Product [id=" + id + ", brand=" + brand + ", Variant=" + Variant + "]";
	}
	
	

}
