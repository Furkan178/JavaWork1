
public class Course {
	int id;
	String courseName;
	String courseInstructor;
	double coursePrice;
	boolean active;
	
	
	
	public Course() {
		System.out.println("Boþ olan Course constructor'ý çalýþtý...");
	}
	
	public Course(int id,String courseName,String courseInstructor,double coursePrice,boolean active)
	{
		this();
		this.id=id;
		this.courseName=courseName;
		this.courseInstructor=courseInstructor;
		this.coursePrice=coursePrice;
		this.active=active;
	}

}
