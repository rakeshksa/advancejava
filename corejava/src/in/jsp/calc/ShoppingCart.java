package in.jsp.calc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Added: " + product.getName());
    }

    public void removeProduct(int productId) {
        boolean removed = productList.removeIf(p -> p.getId() == productId);
        if (removed) {
            System.out.println("Product ID " + productId + " removed.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public Product findProductById(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void viewProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products in store.");
        } else {
            System.out.println("Product List");
            System.out.println("------------------------------------------------------");
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }
}
