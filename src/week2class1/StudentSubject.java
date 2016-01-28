package week2class1;

/**
 * Created by Vladislav on 26.01.2016.
 */
public class StudentSubject {
    private Subject Subject;
    private int studentMark;
    private int usedHours;

    public int getUsedHours() {
        return usedHours;
    }

    public void setUsedHours(int usedHours) {
        this.usedHours = usedHours;
    }

    public StudentSubject(week2class1.Subject Subject) {
        this.Subject = Subject;
    }

    public week2class1.Subject getStudentSubject() {
        return Subject;
    }

    public void setStudentSubject(week2class1.Subject studentSubject) {
        this.Subject = studentSubject;
    }

    public int getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(int studentMark) {
        this.studentMark = studentMark;
    }
}
