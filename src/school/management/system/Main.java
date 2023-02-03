package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1=new Teacher(1, "Alex", 1000);
		Teacher teacher2=new Teacher(1, "Anna", 2000);
		Teacher teacher3=new Teacher(1, "Gouldberg", 3000);
		
		List<Teacher>teacherslist=new ArrayList<>();
		teacherslist.add(teacher1);
		teacherslist.add(teacher2);
		teacherslist.add(teacher3);
		
		Student student1= new Student(1001, "Misbah", 1);
		Student student2= new Student(1002, "Misbah", 1);
		Student student3= new Student(1003, "Misbah", 1);
		
		List<Student> studentslist=new ArrayList<>();
		studentslist.add(student1);
		studentslist.add(student2);
		studentslist.add(student3);
		
		
		//before initializing School we have to pass two list which has the student and teacher
		School ghs=new School(teacherslist, studentslist);
		
		System.out.println("total Money earned by School "+ghs.getTotalMoneryReceived());
		
		student1.setFeesPaid(1000);
		student2.setFeesPaid(3000);
		student3.setFeesPaid(1500);
		
		System.out.println("total Money earned by School "+ghs.getTotalMoneryReceived());
		
	    System.out.println("---school salary---");
	    teacher1.setSalaryEarned(teacher1.getSalary());
	    System.out.println(teacher1.getName()+teacher1.getSalary()+ ghs.getTotalMoneySpentOnTeacher());
	    ghs.setTotalMoneySpentOnUtility(700);
	   System.out.println( ghs.getTotalMonerySpent());
	   
	    System.out.println(student1);//because of toString method in student class we can print directly like this
	
		

	}

}
