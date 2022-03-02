package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// Construtor padrao
	public Product() {
	}
	/*
	 * Construtor: é uma operação especial da classe, que executa no momento da
	 * instanciacao do objeto
	 */
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/*
	 * Sobrecarga é disponibilizar mais de uma versão da mesma operacao do
	 * construtor
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}