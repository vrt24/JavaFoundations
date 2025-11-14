package Day4;

public class Car {
    private String brand;
    private String model;
    private double mileage;

    public Car(String brand, String model, double mileage){
        this.brand=brand;
        this.model=model;
        setMileage(mileage);
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double getMileage(){
        return mileage;
    }
    public void setMileage(double mileage){
        if(mileage<0){
            System.out.println("Invalid mileage");
            return;
        }
        this.mileage=mileage;
    }
}
