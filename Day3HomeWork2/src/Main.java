
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin","Demirog", "123456",35,"Java");
		Instructor instructor2 = new Instructor(2, "Mustafa", "Yılmaz", "279942", 20, "C++");
		
		InstructorManager instructorManager = new InstructorManager();
		System.out.println("Eğitmenlerimiz:");
		instructorManager.LoginInstructor(instructor2);
	    instructorManager.LoginInstructor(instructor1);
	    System.out.println("------------------------");
	    System.out.println("Çıkarılan eğitmenler:");
	    instructorManager.DeleteInstructor(instructor2);
	    System.out.println("------------------------");
	    System.out.println("Eğitmen bilgilerimiz:");
	    instructorManager.DetailInstructor(instructor2);
	    instructorManager.DetailInstructor(instructor1);
	    System.out.println("-------------------------------");
	    
	    Student student1 = new Student(3, "Aslı" , "Tangöz", 11423, "Kız");
	    Student student2 = new Student(4, "Kerem", "Gönlüm", 12479, "Erkek");
	    Student student3 = new Student(5, "Gül", "tavlan", 12487	, "Kız");
	    
	    StudentManager studentManager = new StudentManager();
	    System.out.println("Öğrencilerimiz:");
	    studentManager.DetailStudent(student3);
	    studentManager.DetailStudent(student2);
	    studentManager.DetailStudent(student1);
	    System.out.println("----------------------");
	    System.out.println("Güncellenen öğrenciler:");
	    studentManager.DeleteStudent(student2);
	    System.out.println("---------------");
	    System.out.println("Öğrenci giriş:");
	    studentManager.LoginStudent(student3);
	    studentManager.LoginStudent(student1);
	    
	    User user1 = new User(7, "Furkan", "Tetik");
	    User user2 = new User(12, "Emir", "Cansuz");
	    UserManager userManager = new UserManager();
	    System.out.println("Kullanıcılar:");
	    userManager.LoginUser(user2);
	    userManager.LoginUser(user1);

	}

}
