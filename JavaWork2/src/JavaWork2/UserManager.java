package JavaWork2;

public class UserManager {

	public void addUser(Instructor instructor) {
			
			System.out.println("E�itmen Eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}
	public void addUser(Student student) {
		
		System.out.println("��renci Eklendi: "+student.getFirstName()+" "+student.getLastName());
}
	
	public void updateUser(User user) {
		System.out.println("Kullan�c� G�ncellendi: "+user.getFirstName()+" "+user.getLastName());
	}
	public void deleteUser(User user) {
		System.out.println("Kullan�c� Silindi: "+user.getFirstName()+" "+user.getLastName());
	}
	
}
