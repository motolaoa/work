package 生产消费2;

public class Goods {
    private String brands;
    private String name;

    public Goods(String brands, String name) {
        this.brands = brands;
        this.name = name;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
