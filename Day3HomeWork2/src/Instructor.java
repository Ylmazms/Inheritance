
public class Instructor extends User {

	private String Contact›nfo;
	private int Age;
	private String Category;
	
	public Instructor(int id, String FirstName, String LastName, String contact›nfo, int age, String category) {
		super(id, FirstName, LastName);
		Contact›nfo = contact›nfo;
		Age = age;
		Category = category;
	}

	public String getContact›nfo() {
		return Contact›nfo;
	}

	public void setContact›nfo(String contact›nfo) {
		Contact›nfo = contact›nfo;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
	
	
	
}
