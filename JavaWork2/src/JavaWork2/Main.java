package JavaWork2;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Furkan");
		student.setLastName("AVCI");
		student.seteMail("furkan@gmail.com");
		student.setPassword("123456");
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("DEMİROĞ");
		instructor.seteMail("engin@gmail.com");
		instructor.setPassword("123456");
		
		UserManager userManager=new UserManager();
		userManager.addUser(student);
		userManager.addUser(instructor);
		
		User[] users= {student,instructor};
		for (User user : users) {
			System.out.println(user.getFirstName()+" bir kullanıcıdır.");
		}
		

	}

}
