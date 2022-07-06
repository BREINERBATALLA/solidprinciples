package SingleResponsability.WithoutPrinciple;

public class Product {
    private int stock;
    private int code;
    private double undPrice;
    private String description;

    public Product(int code,int stock, double undPrice, String description) {
        this.code = code;
        this.stock = stock;
        this.undPrice = undPrice;
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getUndPrice() {
        return undPrice;
    }

    public void setUndPrice(double undPrice) {
        this.undPrice = undPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
