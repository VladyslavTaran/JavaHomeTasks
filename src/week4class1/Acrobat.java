package week4class1;

/**
 * Created by Vladislav on 03.02.2016.
 */
public class Acrobat extends Artist {
    private String pseudonym;

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public Acrobat(String name) {
        super(name);
    }

    public void work(){
        System.out.println("Acrobat " + getName() + " is showing tricks!");
        showedTimes += 1;
    }
}
