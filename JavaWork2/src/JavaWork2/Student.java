package JavaWork2;

public class Student extends User{

	private String registeredCourses;
	
	public Student() {
		
	}

	public Student(String registeredCourses) {
		super();
		this.registeredCourses = registeredCourses;
	}

	public String getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(String registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	
	
}
