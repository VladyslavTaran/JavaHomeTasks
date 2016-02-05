package week4class1;

/**
 * Created by Vladislav on 03.02.2016.
 */
public class RopeWalker extends Artist {
    public RopeWalker(String name) {
        super(name);
    }

    public void work(){
        System.out.println("RopeWalker " + getName() + " is going on rope!");
        showedTimes += 1;
    }
}
