package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

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


	/*
	 * Encapsulamento: É um princípio que consiste em esconder detalhes de
	 * implementação de uma classe, expondo apenas operações seguras e que mantenham
	 * os objetos em um estado consistente.
	 * Regra de ouro: o objeto deve sempre estar em um estado consistente, e a
	 * própria classe deve garantir isso.
	 */
	// Metodos gets and sets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}	
	
	
	// Metodos de operações
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