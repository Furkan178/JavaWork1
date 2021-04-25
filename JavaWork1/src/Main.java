
public class Main {

	public static void main(String[] args) {
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse();
		courseManager.listCourse();
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addInstructor();
		instructorManager.listInstructor();
		
		
	}

}
