
public class Student extends User  {
	
	private int ParentNumber;
	private String Gender;
	
	public Student(int id, String FirstName, String LastName, int parentNumber, String gender) {
		super(id, FirstName, LastName);
		ParentNumber = parentNumber;
		Gender = gender;
	}

	public int getParentNumber() {
		return ParentNumber;
	}

	public void setParentNumber(int parentNumber) {
		ParentNumber = parentNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	
		
	}