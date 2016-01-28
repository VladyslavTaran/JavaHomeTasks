package week2class1;

/**
 * Created by Vladislav on 24.01.2016.
 */
public class TestGroup {
    public static void main (String[] args){
        //check group creation
        Group group = new Group("Group1");
        System.out.println("Test group creation " + group.getName().equals("Group1"));
        //check adding students to group
        Student student1 = new Student("Kolya", 23, new Address("Ukraine", "Kyiv", "Peremohy", 4),
                new Contact("222-33-4", "sfd@ee.com"),
                new MyDate(1933, 12, 23));
        group.addStudent(student1);
        System.out.println("Test adding students to group " + (group.getStudents().size() == 1));
        //check adding subjects to group
        group.addSubject(new Subject("Math",180));
        group.addSubject(new Subject("Philosophy",120));
        System.out.println("Test adding subjects to group " + (group.getSubjects().size() == 2));
        //check get subject by name
        System.out.println("Test get subject by name " + group.getSubjectByName("Math").getName().equals("Math"));
    }
}
