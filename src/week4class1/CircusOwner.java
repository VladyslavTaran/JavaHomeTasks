package week4class1;

import java.util.ArrayList;

/**
 * Created by Vladislav on 03.02.2016.
 */
public class CircusOwner extends Worker {
    public ArrayList<Artist> artists;
    private int index = 0;

    public CircusOwner(String name) {
        super(name);
        artists = new ArrayList<Artist>();
    }

    public void hireArtist (Artist artist) {
        artists.add(index, artist);
        index++;
    }

    public void viewAllArtists(){
        for(int i = 0; i < artists.size(); i++){
            Artist artist;
            artist = (Artist)artists.get(i);
            System.out.println("Artist #" + i + ": " + artist.getName());
        }
    }

    public void fireTheMostDrunk (){
        int indexTheMostDrunk = 0;
        for (int i = 0; i < artists.size() - 1; i++){
            if (artists.size() == 1) break;
            else {
                Artist artist1;
                artist1 = (Artist) artists.get(i);
                Artist artist2;
                artist2 = (Artist) artists.get(i + 1);
                if (artist1.getAlcoholUsed() > artist2.getAlcoholUsed()) indexTheMostDrunk = i;
                else indexTheMostDrunk = i + 1;
            }
        }
        artists.remove(indexTheMostDrunk);
    }

    public void paySalaryToAll(int money){
        Worker artist;
        for (int i = 0; i < artists.size(); i++){
            artist = (Worker) artists.get(i);
            if (artist instanceof Acrobat) artist.setMoney(money);
            else if (artist instanceof RopeWalker) artist.setMoney(money + 300);
        }
    }

    public void viewWorkAttempts(){
        Artist artist;
        for (int i = 0; i < artists.size(); i++){
            artist = artists.get(i);
            System.out.println("Workattempts of " + artist.getName() + ": " + artist.showedTimes);
        }
    }
}
