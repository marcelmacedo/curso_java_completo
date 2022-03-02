package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;

	// Construtor padrao
	public Product() {
	}

	/*
	 * Construtor: � uma opera��o especial da classe, que executa no momento da
	 * instanciacao do objeto
	 */
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	/*
	 * Sobrecarga � disponibilizar mais de uma vers�o da mesma operacao do
	 * construtor
	 */
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}


	/*
	 * Encapsulamento: � um princ�pio que consiste em esconder detalhes de
	 * implementa��o de uma classe, expondo apenas opera��es seguras e que mantenham
	 * os objetos em um estado consistente.
	 * Regra de ouro: o objeto deve sempre estar em um estado consistente, e a
	 * pr�pria classe deve garantir isso.
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
	
	
	// Metodos de opera��es
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