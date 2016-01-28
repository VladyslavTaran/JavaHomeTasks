package week2class1;

import java.util.ArrayList;

public class Student {
	private String name;
	private int age;
	private String rank;
	private Address studentAddress;
	private Contact studentContact;
	private MyDate birthDate;
	public ArrayList subjects;
	public Group group;
	private int intSubjIdex = 0;


	public Student(String name, int age, Address studentAdress, Contact studentContact, MyDate birthDate) {
		this.name = name;
		this.age = age;
		this.studentAddress = studentAdress;
		this.studentContact = studentContact;
		this.birthDate = birthDate;
	}

	public void study(String subject, int hoursStudied){
		StudentSubject objSubject = getSubjectByName(subject);
		if (objSubject != null){
			objSubject.setUsedHours(objSubject.getUsedHours() + hoursStudied);
		}
	}

	public void addSubject(String strSubject){
		if (subjects == null){
			subjects = new ArrayList();
		}

		if (group.getSubjectByName(strSubject) != null) {
			subjects.add(intSubjIdex, new StudentSubject(group.getSubjectByName(strSubject)));
			intSubjIdex++;
		}else{
			System.out.println("Subject " +strSubject+ " is not presented in group " + group.getName());
		}
	}

	public boolean removeSubject(String strSubject){
		boolean blnRes = false;
		StudentSubject objSubject;
		for (int i=0; i<subjects.size(); i++){
			objSubject = (StudentSubject)subjects.get(i);
			if (objSubject.getStudentSubject().getName().equals(strSubject)){
				subjects.remove(i);
				blnRes = true;
			}
		}
		return blnRes;
	}

	public void showAllSubjects(){
		StudentSubject objSubject;
		for (int i=0; i<subjects.size(); i++){
			objSubject = (StudentSubject)subjects.get(i);
			System.out.println("Subject name: " + objSubject.getStudentSubject().getName() +
								"(hours:" + objSubject.getStudentSubject().getSubjectHours() + ")");
		}
	}

	public void setMarkOnSubject (String strSubject, int intMark){
		StudentSubject objStSubject;
		for (int i=0; i<subjects.size(); i++){
			objStSubject = (StudentSubject)subjects.get(i);
			if (objStSubject.getStudentSubject().getName().equals(strSubject)){
				objStSubject.setStudentMark(intMark);
			}
		}
	}

	public int getMarkOnSubject (String subject){
		int intMark = -1;

		StudentSubject objStSubject = null;
		for (int i=0; i<subjects.size(); i++){
			objStSubject = (StudentSubject)subjects.get(i);
			if (objStSubject.getStudentSubject().getName().equals(subject)){
				intMark = objStSubject.getStudentMark();
				break;
			}
		}

		return intMark;
	}

	public StudentSubject getSubjectByName(String strSubjectName){
		StudentSubject objRes = null;

		StudentSubject objSubject;
		for (int i=0; i < subjects.size(); i++){
			objSubject = (StudentSubject) subjects.get(i);
			if (objSubject.getStudentSubject().getName().equals(strSubjectName)){
				objRes = objSubject;
			}
		}
		return objRes;
	}

	public float getAvgMark(){
		float fltRes=0;
		StudentSubject objStSubject = null;
		for (int i=0; i < subjects.size(); i++){
			objStSubject = (StudentSubject)subjects.get(i);
			fltRes += objStSubject.getStudentMark();
		}
		fltRes = fltRes/subjects.size();
		return fltRes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Address getStudentAdress() {
		return studentAddress;
	}

	public void setStudentAdress(Address studentAdress) {
		this.studentAddress = studentAdress;
	}

	public Contact getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(Contact studentContact) {
		this.studentContact = studentContact;
	}

	public MyDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}
}