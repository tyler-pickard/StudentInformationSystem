package studentInformationSystem;


public class course {
	
	boolean isOnline; //online course = true, in person =  false and can have a room assigned
	String classroomLocation; //for in person only
	String courseName;
	boolean hasPreReq; // course has prerequisites = true, no prerequisites = false
	
			//constructor added to simplify the creation of courses
	public course(String courseName, String classroomLocation, boolean isOnline, boolean hasPreReq) {
		this.courseName = courseName;
		this.classroomLocation = classroomLocation;
		this.isOnline = isOnline;
		this.hasPreReq = hasPreReq;
	} //end of constructor
	


} //end of course class


