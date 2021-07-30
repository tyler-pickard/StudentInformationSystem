package studentInformationSystem;

public class mainClass {

	
	
	
	
	
	//Main Method
	public static void main(String[] args) {
		
		
		//student selected
		student1();
		System.out.println("Schedule: ");
		//courses established
		course1();
		course3();
		course4();
		course5();
		System.out.println(""); //leaves blank line between students
		
		
		student2();
		System.out.println("Schedule: ");
		course2();
		course3();
		course4();
		course5();
		System.out.println("");
		
		
		student3();
		System.out.println("Schedule: ");
		course1();
		course2();
		course3();
		course4();
		course5();
		course6();
		System.out.println("");
		
		
		student4();
		System.out.println("Schedule: ");
		course3();
		course4();
		System.out.println("");
		
		
	} //end of main method

	
	//course 1
	private static void course1() {
		course CS333 = new course("Advanced Java Coding", "blue room", false, true);
		
		System.out.println("Course Name: " + CS333.courseName);
		
	}
	
	//course 2
	private static void course2() {
		course ENG400 = new course("Ancient Magicial Books", "RavenClaw Room", false, false);
		
		System.out.println("Course Name: " + ENG400.courseName);
		
	}
	//course3
	private static void course3() {
		course CS200 = new course("Intro to Computer Science", "Online Course", true, false);
		
		System.out.println("Course Name: " + CS200.courseName);
		
	}
	
	//course4
	private static void course4() {
		course MAT250 = new course("Statistics", "Online Course", true, false);
		
		System.out.println("Course Name: " + MAT250.courseName);
		
	}
	
	
	//course5
	private static void course5() {
		course GYM300 = new course("Dance Lessons with Syrio Forel", "The Tower of the Hand", false, false);
		
		System.out.println("Course Name: " + GYM300.courseName);
		
	}
	
	//course6
	private static void course6() {
		course DADA400 = new course("Defense Against the Dark Arts", "3C", false, true);
		
		System.out.println("Course Name: " + DADA400.courseName);
		
	}
	
	
	//student1
	
	public static void student1() {
		student Tyler = new student("Tyler", "Pickard", 1, "Computer Science", true);
		System.out.println("Name: " + Tyler.firstName + " " + Tyler.lastName);
	}
	
	
	//student2
	
	public static void student2() {
		student Arya = new student("Arya", "Stark", 2, "Water Dancing", true);
		System.out.println("Name: " + Arya.firstName + " " + Arya.lastName);
	}
	
	
	
	//student3
	
	public static void student3() {
		student Hermione = new student("Hermione", "Granger", 3, "Complete Mastery of the School", true);
		System.out.println("Name: " + Hermione.firstName + " " + Hermione.lastName);
	}
	
	
	//student4
	
	public static void student4() {
		student Michael = new student("Michael", "Scott", 4, "Business", false);
		System.out.println("Name: " + Michael.firstName + " " + Michael.lastName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end of class
