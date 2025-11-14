package Day4;

public class CarMain {
    public static void main(String[] args){
        Car car1=new Car("Tesla","Model 3",326);
        Car car2=new Car("Ford","Mach E3",250);
        car2.setMileage(444);
        car1.setMileage(-200);
        System.out.println(car1.getBrand());
        System.out.println(car1.getModel());
        System.out.println(car1.getMileage());
        System.out.println(car2.getMileage());
    }
}
