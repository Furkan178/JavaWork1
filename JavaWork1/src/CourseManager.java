
public class CourseManager {
	Course course1;
	Course course2;
	Course course3;
	
	public void addCourse() {
		
		
		 course1=new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kapmý(C# ve ANGULAR)",
				"Engin Demirog",0,false);
		course2=new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kapmý(JAVA ve REACT)",
				"Engin Demirog",0,true);
		course3=new Course(3,"Yazýlým Geliþtirici Yetiþtirme Kapmý(Programlamaya Giriþ için Temel Kurs)",
				"Engin Demirog",0,true);
	}
	
	
	public void listCourse() {
		Course[] courses= {course1,course2,course3} ;
		
		System.out.println("\nAKTÝF KURSLAR");
		for (Course course : courses) {
			if (course.active == true) {
				System.out.println("Course Id :"+course.id+"\nCourse Name :"+course.courseName
						+"\nCourse Instructor :"+course.courseInstructor+"\nCoursePrice :"+course.coursePrice+
						"\nCourse Active: True\n");
			}
		}
		
		System.out.println("\nPASÝF KURSLAR");
		for (Course course : courses) {
			if (course.active == false) {
				System.out.println("Course Id :"+course.id+"\nCourse Name :"+course.courseName
						+"\nCourse Instructor :"+course.courseInstructor+"\nCoursePrice :"+course.coursePrice+
						"\nCourse Active: False");
			}
		}
		System.out.println("--------------");
	}
}
