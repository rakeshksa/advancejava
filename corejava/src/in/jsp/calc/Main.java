package in.jsp.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println("welcome to shopping Application");
    	System.out.println("press 1 for add the product");
    	System.out.println("press 2 for view the product");
    	System.out.println("press 3 for find the product");
    	System.out.println("press 4 for remove the product");
    	System.out.println("press 5 for Exit the Application");
    	Scanner sc=new Scanner(System.in);
    	
    	int choice=sc.nextInt();
    	
        ShoppingCart cart = new ShoppingCart();
        switch (choice) {
		case 1:
			System.out.println("enter product id : ");
			int pid=sc.nextInt();
			System.out.println("enter product name : ");
			String pname=sc.next();
			System.out.println("enter product price : ");
			Double price=sc.nextDouble();
			cart.addProduct(new Product(pid, pname,price));
			
			
		case 2:
			cart.viewProducts();
			
		case 3:
			System.out.println("enter product id what you want :");
			int prodid=sc.nextInt();
			Product found = cart.findProductById(prodid);
			if (found != null) {
				System.out.println("Found product: " + found);
			} else {
				System.out.println("Product not found.");
			}
			
			
		case 4:
			System.out.println("enter product id which you want to remove");
			int proid=sc.nextInt();
			cart.removeProduct(proid);
			
		case 5:
			System.out.println("Thank you for visiting our Application");
			break;

		default:
			System.out.println("invalid choice");
			
		}
        
       }
}
