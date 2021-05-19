package JavaWork2;

public class InstructorManager extends UserManager{
	
	public void instructorUpdate(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" kurs veriyor");
	}
}
