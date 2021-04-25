
public class Instructor {
	
	int ýnstructorId;
	String ýnstructorName;
	String ýnstructorCategory;
	boolean active;
	
	public Instructor() {
		System.out.println("Boþ olan Instructor constructor'ý çalýþtý...");
	}
	public Instructor(int id,String name,String category,boolean active) {
		this();
		ýnstructorId=id;
		ýnstructorName=name;
		ýnstructorCategory=category;
		this.active=active;
		
	}
	
}
