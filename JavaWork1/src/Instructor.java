
public class Instructor {
	
	int �nstructorId;
	String �nstructorName;
	String �nstructorCategory;
	boolean active;
	
	public Instructor() {
		System.out.println("Bo� olan Instructor constructor'� �al��t�...");
	}
	public Instructor(int id,String name,String category,boolean active) {
		this();
		�nstructorId=id;
		�nstructorName=name;
		�nstructorCategory=category;
		this.active=active;
		
	}
	
}
