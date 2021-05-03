
public class StudentManager {
	
	public void LoginStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli öğrenci sisteme giriş yapmıştır...");
		
	}
	
	public void DeleteStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli öğrenci sistemden silinmiştir...");
		
	}
	
	public void DetailStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " isimli öğrencinin ebeveyn telefon numarası: "
				+ student.getParentNumber() + " 'dir. Öğrencinin cinsiyeti: " + student.getGender());
	}
	

}
