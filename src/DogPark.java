import java.util.Random;

public class DogPark {

    public static int lapsRan() {
        Random rand = new Random();
        int upperbound = 25;
        int lapsRan = rand.nextInt(upperbound);

        return lapsRan;
    }
}
