package SingleResponsability.WithPrinciple;

import SingleResponsability.WithoutPrinciple.Product;

import java.util.List;

public class showMenu {
    private List<SingleResponsability.WithoutPrinciple.Product> listProducts;

    public showMenu(List<SingleResponsability.WithoutPrinciple.Product> listProducts) {
        this.listProducts = listProducts;
    }

    public void viewProducts(List<SingleResponsability.WithoutPrinciple.Product> listProducts) {
        listProducts.stream().forEach(System.out::println);
    }


}
