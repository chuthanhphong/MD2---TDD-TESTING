package DEMOQLSP;

public class Motor extends Vehice implements Manage<Vehice> {
    @Override
    public void ADD() {

    }

    @Override
    public void Edit() {

    }

    @Override
    public void Delete() {

    }

    @Override
    public void Search() {

    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }
    private  double cc ;

    public Motor() {
    }

    public Motor(double cc) {
        this.cc = cc;
    }

    public Motor(String color, String brand, String name, int price, double cc) {
        super(color, brand, name, price);
        this.cc = cc;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "This car is :" + super.getName() + " This color is " + super.getColor() + "this brand is" + super.getBrand()
                + "this price is " + getPrice();

    }
}
