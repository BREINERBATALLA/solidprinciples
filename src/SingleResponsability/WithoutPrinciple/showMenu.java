package SingleResponsability.WithoutPrinciple;

import java.math.BigDecimal;
import java.util.List;

public class showMenu {
    private List<Product> listProducts;

    public showMenu(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public void viewProducts(List<Product> listProducts) {
        listProducts.stream().forEach(System.out::println);
    }

    //This 3 methods don't make sense with objective of the class
    public void addProductToCart(Product producto) {
        System.out.println( "Product was added successfully");

    }

    public void removeProductToCart(int code){
        System.out.println("Product" + code +"was removed successfully");
    }

    public double calculateTotalCartProducts() {
        return listProducts.stream().map(x-> x.getUndPrice()).reduce(0.0,(acc,elm)-> acc+elm);
    }

}
