package school.management.system;

import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;

	// we can access to without creating class instance
	private static int totalMoneySpentOnUtility;
	private static int totalMoneySpentOnTeacher; //
	private static int totalMoneryReceived;
	private static int totalMonerySpent;
	private static int totalMoneyLeft;

	// constructor takes list of 2 object
	public School(List<Teacher> teachers, List<Student> students) {

		this.teachers = teachers;
		this.students = students;
		this.totalMoneryReceived = 0;
		this.totalMonerySpent = 0;
		
	}

	public List<Teacher> getTeachers() { // we can take list of Teacher object
		return teachers;
	}

	public List<Student> getStudents() { // we can take list of Student object
		return students;
	}
	
	public int getTotalMoneySpentOnUtility() {
		return totalMoneySpentOnUtility;
	}

	public static void setTotalMoneySpentOnUtility(int totalMoneySpentOnUtility) {
		School.totalMoneySpentOnUtility = totalMoneySpentOnUtility;
	}


	public int getTotalMoneySpentOnTeacher() {
		return totalMoneySpentOnTeacher;
	}
	public static void setMoneySpentOnTeacher(int moneySpent) {
		totalMoneySpentOnTeacher = totalMoneySpentOnTeacher + moneySpent;

	}
	
	public int getTotalMoneryReceived() {  //we get it from students money;
		return totalMoneryReceived;
	}
	//setMoneyReceived
	public static void updateMoneyReceived(int moneyReceived) {
			totalMoneryReceived = totalMoneryReceived + moneyReceived;
	}

	public int getTotalMonerySpent() {
		return totalMonerySpent = totalMoneySpentOnTeacher + totalMoneySpentOnUtility;
	}
	
	public int moneySpentOnUtility() {
		int moneySpentOnUtility;
		moneySpentOnUtility = totalMoneryReceived - totalMoneySpentOnUtility;
		return moneySpentOnUtility;

	}

	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	
	
	public static int getTotalMoneyLeft() {
		return totalMoneyLeft;
	}

	public static void setTotalMoneyLeft(int totalMoneyLeft) {
		School.totalMoneyLeft = totalMoneyLeft;
	}

	
	// ••public static void updateTotalMoneySpent() {
	// totalMonerySpent=totalMoneySpentOnTeacher+totalMoneySpentOnUtility;
	// }

	public static void updateTotalMoneySpent(int moneySpent) {
		totalMonerySpent = totalMoneryReceived - (totalMoneySpentOnTeacher + totalMoneySpentOnUtility);
		
		//totalMonerySpent =(totalMoneySpentOnTeacher + totalMoneySpentOnUtility);
		
	}
	
	public static void updateTotalMoneyLeft(int moneySpent) {
		totalMoneyLeft = totalMoneryReceived - (totalMoneySpentOnTeacher + totalMoneySpentOnUtility);
		
		//totalMonerySpent =(totalMoneySpentOnTeacher + totalMoneySpentOnUtility);
		
	}

}
