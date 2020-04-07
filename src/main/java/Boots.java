/**
 * Created by Kaczmarczyk on 2020-04-03.
 */
public class Boots extends Product {

    private int size;
    private boolean isNaturalSkin;

    public Boots (Long id, String productName, Float price, Float weight, String color, int productCount, int size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return super.toString() + "Boots{" +
                "size='" + size + '\'' +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }

}
