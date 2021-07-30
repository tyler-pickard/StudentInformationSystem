package studentInformationSystem;

public class student {
	boolean gpaReached; //above 3.5 = true, under = false
	int studentId;
	String firstName;
	String lastName;
	String major;
	
	//constructor added to simplify the adding of students
	public student(String firstName, String lastName, int studentId, String major, boolean gpaReached) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.major = major;
		this.gpaReached = gpaReached;
	}//end of constructor
}
