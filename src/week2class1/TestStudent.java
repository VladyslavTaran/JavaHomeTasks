package week2class1;

/**
 * Created by Vladislav on 24.01.2016.
 */
public class TestStudent {
    public static void main (String[] args){
        //define student1
        Student student1 = new Student("Kolya", 23, new Address("Ukraine", "Kyiv", "Peremohy", 4),
                                        new Contact("222-33-4", "sfd@ee.com"),
                                        new MyDate(1933, 12, 23));
        //test student creation
        System.out.println("Test Student creation: " + (student1.getName()).equals("Kolya"));
        //define student2
        Student student2 = new Student("Vasya", 25, new Address("Ukraine", "Lviv", "Bandery", 7),
                new Contact("234-55-77", "Vasya@fr.ua"),
                new MyDate(1986, 04, 04));
        //create new group Group1
        Group group = new Group("Group1");
        //add subjects to Group1
        group.addSubject(new Subject("Math",180));
        group.addSubject(new Subject("History",100));
        group.addSubject(new Subject("Religion",70));
        //add student1 to Group1
        group.addStudent(student1);
        //check adding subjects that exist in group
        student1.addSubject("Math");
        student1.addSubject("History");
        student1.addSubject("Religion");
        System.out.println("Test Student add existing subject: " + (student1.subjects.size() == 3));
        //check adding to student1 non-existing subject
        System.out.println("Test Student add non-existing subject: ");
        student1.addSubject("Philosophy");
        //check removing subject from student
        student1.removeSubject("History");
        System.out.println("Test Student removing subject: " + (student1.subjects.size() == 2));
        //check Student set mark on subject
        student1.setMarkOnSubject("Math",5);
        student1.setMarkOnSubject("Religion",4);
        System.out.println("Test Student set mark on Subject: " + (student1.getMarkOnSubject("Math") == 5));
        //check mark on subject
        System.out.println("Test Student check mark on Subject: " + (student1.getMarkOnSubject("Religion") == 4));
        //check student avg mark
        System.out.println("Test Student avg mark: " + (student1.getAvgMark() == 4.5));
        //check studentstudy
        student1.study("Math",12);
        System.out.println("Test Student study: " + (student1.getSubjectByName("Math").getUsedHours() == 12));
        //dheck get subject by name
        System.out.println("Test Student getSubjectByName: " + (student1.getSubjectByName("Math").getStudentSubject().getName().equals("Math")));
    }
}
