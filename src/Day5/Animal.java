package Day5;

class Animal {
    void makeSound(){
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bow");
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
class Cow extends Animal{
    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}