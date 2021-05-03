
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor(1, "Engin","Demirog", "123456",35,"Java");
		Instructor instructor2 = new Instructor(2, "Mustafa", "Y�lmaz", "279942", 20, "C++");
		
		InstructorManager instructorManager = new InstructorManager();
		System.out.println("E�itmenlerimiz:");
		instructorManager.LoginInstructor(instructor2);
	    instructorManager.LoginInstructor(instructor1);
	    System.out.println("------------------------");
	    System.out.println("��kar�lan e�itmenler:");
	    instructorManager.DeleteInstructor(instructor2);
	    System.out.println("------------------------");
	    System.out.println("E�itmen bilgilerimiz:");
	    instructorManager.DetailInstructor(instructor2);
	    instructorManager.DetailInstructor(instructor1);
	    System.out.println("-------------------------------");
	    
	    Student student1 = new Student(3, "Asl�" , "Tang�z", 11423, "K�z");
	    Student student2 = new Student(4, "Kerem", "G�nl�m", 12479, "Erkek");
	    Student student3 = new Student(5, "G�l", "tavlan", 12487	, "K�z");
	    
	    StudentManager studentManager = new StudentManager();
	    System.out.println("��rencilerimiz:");
	    studentManager.DetailStudent(student3);
	    studentManager.DetailStudent(student2);
	    studentManager.DetailStudent(student1);
	    System.out.println("----------------------");
	    System.out.println("G�ncellenen ��renciler:");
	    studentManager.DeleteStudent(student2);
	    System.out.println("---------------");
	    System.out.println("��renci giri�:");
	    studentManager.LoginStudent(student3);
	    studentManager.LoginStudent(student1);
	    
	    User user1 = new User(7, "Furkan", "Tetik");
	    User user2 = new User(12, "Emir", "Cansuz");
	    UserManager userManager = new UserManager();
	    System.out.println("Kullan�c�lar:");
	    userManager.LoginUser(user2);
	    userManager.LoginUser(user1);

	}

}
