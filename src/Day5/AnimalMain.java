package Day5;

public class AnimalMain {
    public static void main(String[] args){
        Animal[] animals={new Dog(),new Cat(),new Cow()};
        for (Animal a:animals){
            a.makeSound();
        }
    }
}
