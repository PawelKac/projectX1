package company;

/**
 * Created by Kaczmarczyk on 2020-05-22.
 */
public class Cloth extends Product {

    private String size;
    private String material;

    public Cloth(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + "company.Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

}
