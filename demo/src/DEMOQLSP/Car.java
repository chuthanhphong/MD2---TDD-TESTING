package DEMOQLSP;

public class Car extends Vehice implements Manage<Car> {
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
    private int seats ;

    public Car(int seats) {
        this.seats = seats;
    }

    public Car() {
    }

    public Car(String color, String brand, String name, int price, int seats) {
        super(color, brand, name, price);
        this.seats = seats;
    }

    public int  getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return " This car is :" + Car.super.getName() + " This color is " + super.getColor() + "this brand is" + super.getBrand()
                + "this price is " + getPrice();
    }
}
