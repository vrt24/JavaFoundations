package Day9;

public class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public double area() {
        return length*breadth;
    }
}
