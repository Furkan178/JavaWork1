package JavaWork2;

public class UserManager {

	public void addUser(Instructor instructor) {
			
			System.out.println("Eðitmen Eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
	}
	public void addUser(Student student) {
		
		System.out.println("Öðrenci Eklendi: "+student.getFirstName()+" "+student.getLastName());
}
	
	public void updateUser(User user) {
		System.out.println("Kullanýcý Güncellendi: "+user.getFirstName()+" "+user.getLastName());
	}
	public void deleteUser(User user) {
		System.out.println("Kullanýcý Silindi: "+user.getFirstName()+" "+user.getLastName());
	}
	
}
