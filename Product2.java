package day3;

import java.util.Scanner;

public class Product2 {
	Scanner sc=new Scanner(System.in);
private int productId;
private String productName;
private int quantityOnHand;
private int price;
private int id,q,p;

public Product2() {
	System.out.println("Enter the product id");
	id=sc.nextInt();
	while(id<0)
	{
		System.out.println("Enter the productId correctly");
		id=sc.nextInt();
	}
	productId=id;
	
	System.out.println("Enter the product name");
	productName=sc.next();
	
	System.out.println("Enter the quantity on hand of product");
	q=sc.nextInt();
	while(q<0)
	{
		System.out.println("Enter the productId correctly");
		q=sc.nextInt();
	}
	quantityOnHand=q;
	
	System.out.println("Enter the price of product");
	p=sc.nextInt();
	while(p<0)
	{
		System.out.println("Enter the productId correctly");
		p=sc.nextInt();
	}
	price=p;
	
}

public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
			+ ", price=" + price + "]";
}

}
