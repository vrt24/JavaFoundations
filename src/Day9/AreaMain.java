package Day9;

public class AreaMain {
    public static void main(String[] args){
        Shape c=new Circle(5.0);
        Shape r=new Rectangle(5,10);
        System.out.println(c.area());
        System.out.println(r.area());
    }
}
