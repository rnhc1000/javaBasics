package br.dev.ferreiras;

public class Car {
	private long id;
	private String model;
	private String brand;
	private int horses;
	private double price;

	public Car(long id, String model, String brand, int horses, double price) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.horses = horses;
		this.price = price;
	}

	public Car() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHorses() {
		return horses;
	}

	public void setHorses(int horses) {
		this.horses = horses;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", brand=" + brand + ", horses=" + horses + ", price=" + price
				+ "]";
	}

}