import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entity.Bolum;
import entity.Student;
import entity.Student_identity;
import servicelmpl.BolumController;
import servicelmpl.StudentController;
import servicelmpl.StudentIdentityController;


public class main_student {

	public static void main(String[] args) {
		 
		//Student s = new Student("ÖZKAN","ÇAÐLI","05067292587");
	//	StudentController controller = new StudentController();
		//controller.create(s);
		
//		Student std1=controller.find(8);
//		std1.bilgileriYazdir();
//		
//		controller.delete(std1);
		
//		Student student = new Student(1,"BURAK","GÖKMEN","05485687452");
//		controller.update(student);
		
//		ArrayList<Student> reslist = controller.list();
//		for(Student student : reslist)
//			student.bilgileriYazdir();
				

	//	System.out.println(controller.idToplamlari());
	
	
	
//		ArrayList<Student> reslist = controller.list();
//		for(Student student : reslist) {
//			student.bilgileriYazdir();	
//			student.getIdentity().bilgileriYazdir();
//		}
		
		
		
		StudentIdentityController stdntIdentityCont = new StudentIdentityController();
//		Student_identity identity = stdntIdentityCont.find(14);
//		identity.bilgileriYazdir();
//		
// 		Student student = new Student("NECÝP","UYSAL","05486452156",identity);
		StudentController studentController= new StudentController();
//		studentController.create(student);
		
		
//		Student_identity identity = new Student_identity(564651,"KIMYA");
//		stdntIdentityCont.create(identity);
//		
//		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
//		try {
//			Date d =(Date) df.parse("2023/01/01");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Date d = new Date();

		
		
//		ArrayList<Student> list = studentController.id2DenBuyukListe();
//		for(Student s:list)
//			s.bilgileriYazdir();

		
//		ArrayList<Student> list = studentController.idNdenKucukListe(15);
//		for(Student s:list)
//			s.bilgileriYazdir();
		
//		ArrayList<Student> list = studentController.adaGoreSorgula("MERT");
//		for(Student s:list)
//			s.bilgileriYazdir();
		
		
		
//		ArrayList<Student> list = studentController.bolumAdinaGoreStudentList("KIMYA");
//		for(Student s:list)
//			s.bilgileriYazdir();
		
		
		
//		ArrayList<Object[]> list = studentController.cokluAlanGetir();
//		for(Object[] s:list)
//		System.out.println("id = " + s[0] + " | name = " + s[1]);
		
		
		
//		ArrayList<Student> list = studentController.sorgulaKriterle("BURAK","KIMYA");
//		for(Student s:list)
//			s.bilgileriYazdir();
		
		
		BolumController bolumController = new BolumController();
		ArrayList<Bolum> list = bolumController.list();
		for(Bolum s:list)
			s.bilgileriYazdir();
		
		
	}

}
