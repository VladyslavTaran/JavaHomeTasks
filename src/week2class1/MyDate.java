package week2class1;

/**
 * Created by Vladislav on 23.01.2016.
 */
public class MyDate {
    private int Year;
    private int Month;
    private int Day;

    public MyDate(int year, int month, int day) {
        Year = year;
        Month = month;
        Day = day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }
}
