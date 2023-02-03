package school.management.system;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0; //initially not going to take any money from student.
		this.feesTotal = 30000; //the fees is not going to change for every student
	}
	
	//to access the property of this class from other class we have to call with below method 
	//as they are defined as private variable

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	//we are not going to update name, id so we dont need setter method for them and feesTotal is also given 
	//so we dont need for it too
	//we only need to have setter methods for grade and feePaid, as they will be updated. like when a student
	//pays the fee, the feesPaid value will be updated using setFeesPaid method. same for other one.

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setFeesPaid(int fees) {
		feesPaid = feesPaid+fees;
	    
		School.updateMoneyReceived(fees); // whenever student pays, we have to update the money received by school
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", feesPaid=" + feesPaid + ", feesTotal="
				+ feesTotal + "]";
	}
	
	
	
	
	
	
	
	

}
