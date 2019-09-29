package day3;

import java.util.Scanner;

public class Product3 {
	Scanner sc=new Scanner(System.in);
private int productId;
private String productName;
private int quantityOnHand;
private int price;
public Product3(int productId, String productName, int quantityOnHand, int price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.quantityOnHand = quantityOnHand;
	this.price = price;
}

public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
			+ ", price=" + price + "]";
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

}
