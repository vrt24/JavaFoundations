package Day5;

public class ShapeMain {
    public static void main(String[] args){
        Shape[] shapes={new Circle(5),new Rectangle(4,6)};
        for (Shape s:shapes){
            System.out.println(s.area());
        }
    }
}
