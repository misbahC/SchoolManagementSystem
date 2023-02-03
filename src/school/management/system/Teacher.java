package school.management.system;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		salaryEarned=0; // the initail salary is 0 when a teacher get enrolled
	}
	
	//to access the property of this class from other class we have to call with below method 
		//as they are defined as private variable

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}

	public int getSalaryEarned() {
		return salaryEarned;
	}
	
	//teacher'salary might get increase because of skill etc, so we need setter method for it 
	// for other property we dont need setter as they are not going to change.
	public void setSalaryEarned(int salary) {
		salaryEarned = salaryEarned+salary;
		
		//its a spent for school
		School.setMoneySpentOnTeacher(salary); //whenever, teacher get paid, the spent amount of school updated and moneySpentOnTeacher method is a static method which we can call without creating the object of school
	}
	
	
	
	
	
	
	

}
