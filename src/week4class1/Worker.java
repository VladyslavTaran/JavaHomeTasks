package week4class1;

/**
 * Created by Vladislav on 03.02.2016.
 */
public class Worker {
    private String name;
    private int money;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void work(){
        System.out.printf("Worker is working!");
    }
}
