package abstractionConcepts;

public abstract class AddProductToCart {
	
	
	public abstract void productCategory();
	
	public void productName(String productName) {
		System.out.println("Product entered is " + productName );
	}
	
	public double priceOfProduct(double price) {
		System.out.println("price of product is  " + price);
		return price;
	}
	
	public abstract void quantityInStock();
	
	public int quantity(int quantity) {
		System.out.println("quantity of product is  " + quantity);
		return quantity;
	}
	
	public abstract void productUnit();
	
	
	

}
