package week2class1;

/**
 * Created by Vladislav on 24.01.2016.
 */
public class Subject {
    private String name = "";

    public int getSubjectHours() {
        return subjectHours;
    }

    public void setSubjectHours(int subjectHours) {
        this.subjectHours = subjectHours;
    }

    private int subjectHours = 0;

    public Subject(String name, int subjectHours) {
        this.name = name;
        this.subjectHours = subjectHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
