
public class InstructorManager {
	
	public void LoginInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli ��remten "
	+ instructor.getCategory() + " dersi vermektedir." );
	}
	
	public void UpdateInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + "isimli e�itmen art�k " + 
	instructor.getCategory() + " dersleri de vermeye ba�lam��t�r, iyi �al��malar...");
	}
	
	public void DeleteInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli e�itmen, bundan sonra " + 
	instructor.getCategory() + " dersleri vermeyecektir...");
	}
	
	public void DetailInstructor(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli e�itmenin ileti�im bilgileri: "
				+ instructor.getContact�nfo() + " 'dir. Ya��: " + instructor.getAge() + " 'dir."
				+ "E�itim verdi�i alan ise " + instructor.getCategory() + " 'dir.");
	}

}
