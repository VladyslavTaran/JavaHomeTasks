package week2class1;

import java.util.ArrayList;

public class Group {

    public String name;
    private ArrayList students;
    private ArrayList subjects;
    private int index = 0;
    private int subjIndex = 0;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList();
        this.subjects = new ArrayList();
    }

    public void addStudent(Student student){
        student.group = this;
        students.add(index,student);
        index++;
    }

    public Subject getSubjectByName (String strSubject){
        Subject objSubject;
        Subject objRes=null;
        for (int i=0; i < subjects.size(); i++){
            objSubject = (Subject)subjects.get(i);
            if (objSubject.getName().equals(strSubject)){
                objRes = objSubject;
            }
        }
        return objRes;
    }

    void showAllStudents() {
        Student objStudent;
        for (int i = 0; i < students.size(); i++) {
            objStudent = (Student)students.get(i);
            System.out.println("Student(s) #" + i + " name: " + objStudent.getName() + " age: " + objStudent.getAge());
        }
    }

    void showAllSubjects(){
        Subject objSubject;
        for (int i = 0; i < subjects.size(); i++) {
            objSubject = (Subject) subjects.get(i);
            System.out.println("Subject(s) #" + i + " name: " + objSubject.getName() + " (hours:" + objSubject.getSubjectHours() + ")");
        }
    }

    public void addSubject (Subject subject){
        subjects.add(subjIndex,subject);
        subjIndex++;
    }

    public ArrayList getStudents() { return students; }

    public void setStudents(ArrayList students) { this.students = students; }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student findById(int index){ return (Student)students.get(index); }

    public ArrayList getSubjects() { return subjects; }

    public void setSubjects(ArrayList subjects) { this.subjects = subjects; }
}
