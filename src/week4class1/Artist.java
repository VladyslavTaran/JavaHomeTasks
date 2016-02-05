package week4class1;

/**
 * Created by Vladislav on 03.02.2016.
 */
public class Artist extends Worker {
    private int alcoholUsed;
    public int showedTimes;

    public Artist(String name) {
        super(name);
    }

    public int getAlcoholUsed() {
        return alcoholUsed;
    }

    public void setAlcoholUsed(int alcoholUsed) {
        this.alcoholUsed = alcoholUsed;
    }

    public void drink(int alcoholAmount){
        alcoholUsed += alcoholAmount;
    }
}
