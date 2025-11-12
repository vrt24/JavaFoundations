package Day3;

public class Car {
    String brand;
    int year;
    double price;

    public Car(String brand, int year, double price){
        this.brand=brand;
        this.year=year;
        this.price=price;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand + " Year: " + year + " Price: " + price);
    }
}