package Day5;

public class PlayMain {
    public static void main(String[] args){
        Playable[] games={new Cricket(),new Football(),new Volleyball()};
        for (Playable p:games){
            p.play();
        }
    }
}
