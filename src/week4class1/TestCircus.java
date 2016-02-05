package week4class1;

import java.util.ArrayList;

/**
 * Created by Vladislav on 04.02.2016.
 */
public class TestCircus {
    public static void main(String[] args) {
        CircusOwner circusOwner = new CircusOwner("Main Clown");
        Acrobat artist1 = new Acrobat("Acrobat Petya");
        RopeWalker artist2 = new RopeWalker("RopeWalker Styopa");
        Acrobat artist3 = new Acrobat("Acrobat Veniamin");
        artist3.setPseudonym("Alkash");

        circusOwner.hireArtist(artist1);
        circusOwner.hireArtist(artist2);
        circusOwner.hireArtist(artist3);

        artist1.drink(10);
        artist2.drink(20);
        artist3.drink(70);

        artist1.work();
        artist2.work();
        artist3.work();
        artist3.work();

        circusOwner.paySalaryToAll(2000);

        circusOwner.viewWorkAttempts();

        circusOwner.fireTheMostDrunk();

        circusOwner.viewAllArtists();
    }
}
