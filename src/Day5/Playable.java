package Day5;

public interface Playable {
    void play();
}
class Football implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Football");
    }
}
class Cricket implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Cricket");
    }
}
class Volleyball implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Volleyball");
    }
}