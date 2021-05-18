package DEMOQLSP;

public abstract class Vehice {
    private String Color;
    private String Brand;
    private String name ;
    private int Price;

    public Vehice() {
    }

    public Vehice(String color, String brand, String name, int price) {
        Color = color;
        Brand = brand;
        this.name = name;
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Vehice{" +
                "Color='" + Color + '\'' +
                ", Brand='" + Brand + '\'' +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                '}';
    }
}
