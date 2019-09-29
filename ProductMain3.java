package day3;

import java.util.Scanner;

public class ProductMain3 {
private static int a,i;
private static int count=0;
	
	public static void main(String args[]) {
		Product3 p[] = new Product3[5];
		 p[0]=new Product3(10010,"neha",66,34);
		 p[1]=new Product3(10011,"sneha",6,24);
		 p[2]=new Product3(10012,"reha",66,24);
		 p[3]=new Product3(10013,"teha",67,24);
		 p[4]=new Product3(10014,"yeha",167,44);
		 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the product Id to search");
		a=sc.nextInt();
		for( i=0;i<5;i++)
		{
			if(a==p[i].getProductId())
			{
				count++;
				break;
				
			}
			
		}
		if(count==1)
			System.out.println(p[i]);
		else
			System.out.println("Item not found");
		
		
		
	}
}
