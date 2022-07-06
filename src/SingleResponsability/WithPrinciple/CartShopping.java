package SingleResponsability.WithPrinciple;

import java.util.List;

public class CartShopping {
    private List<Product> listProducts;

    public CartShopping(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public void addProductToCart(Product producto) {
        System.out.println( "Product was added successfully");
    }

    public void removeProductToCart(int code) {
        System.out.println("Product" + code +"was removed successfully");
    }

    public double calculateTotalCartProducts() {
        return listProducts.stream().map(x-> x.getUndPrice()).reduce(0.0,(acc,elm)-> acc+elm);
    }
}
