
public class InstructorManager {
	Instructor instructor1;
	Instructor instructor2;
	
	public void addInstructor() {
		
		
		instructor1=new Instructor(1,"Engin Demirog","Programlama",true);
		instructor2=new Instructor(2,"Muhammed Furkan AVCI","Programlama",false);
		
	}
	
	
	public void listInstructor() {
		Instructor[] instructors= {instructor1,instructor2} ;
		
		System.out.println("\nAKT�F E��TMENLER");
		for (Instructor instructor:instructors) {
			if (instructor.active == true) {
				System.out.println("Instructor ID :"+instructor.�nstructorId+"\nInstructor Name :"+instructor.�nstructorName
						+"\nInstructor Category :"+instructor.�nstructorCategory+"\nInstructor active :True");
			}
		}
		
		System.out.println("\nPAS�F E��TMENLER");
		for (Instructor instructor:instructors) {
			if (instructor.active == false) {
				System.out.println("Instructor ID :"+instructor.�nstructorId+"\nInstructor Name :"+instructor.�nstructorName
						+"\nInstructor Category :"+instructor.�nstructorCategory+"\nInstructor active :False");
			}
		}
	}
}

