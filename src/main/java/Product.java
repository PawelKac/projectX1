package company;

/**
 * Created by Kaczmarczyk on 2020-05-22.
 */
public class Product {

    private long id;
    private String productName;
    private float price;
    private float weight;
    private String color;
    private int productCount;

    public Product(Long id, String productName, Float price, Float weight, String color, int productCount) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount=productCount;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setProductCount(int productCount){
        this.productCount = productCount;
    }

    public Long getId(){
        return id;
    }

    public String getProductName(){
        return productName;
    }

    public float getPrice(){
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getProductCount(){
        return productCount;
    }

    @Override
    public String toString() {
        return "company.Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", productCount=" + productCount +
                '}';
    }
}
