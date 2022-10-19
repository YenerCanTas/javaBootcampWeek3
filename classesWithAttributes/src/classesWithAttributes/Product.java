package classesWithAttributes;

public class Product {
	
	public Product() {
		
	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	public String setDescription;
	
	
	public int getId() {
		
		return id;
		
	}
	
	public void setId(int id) {
		this.id=id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}


	
	
	
	
}
