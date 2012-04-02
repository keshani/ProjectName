package pkg1;

import java.util.Iterator;

public class StudentManagementSystem {

	private StudentRepository repo;

    public StudentManagementSystem(StudentRepository repository) {
        repo = repository;
    }


	public void listAllStudents() {
            Iterator it= repo.findAllStudents().iterator();

            while(it.hasNext()){
                Student st = (Student)it.next();
                System.out.println("Student's registration number: "+st.getRegNo());
                System.out.println("Student's first name: "+st.getFirstName());
                System.out.println("Student's last name: "+st.getLastName());
                System.out.println("Student's address: "+st.getAddress());
            }
	}

	public void registerStudent(Student stu){
            repo.saveStudent(stu);
	}
        public  static void main(String args[])
        {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("StudentRepository.xml");
        context.start();

        StudentManagementSystem system1=(StudentManagementSystem)context.getBean("system1");
        system1.listAllStudents();
        system1.registerStudent(new Student("Keshani","Rathnayake",100456,"N0 202 COLOMBO"));
        system1.registerStudent(new Student("Mihirani","Sethunga",100254,"N0 104 Kurunegala"));
        system1.registerStudent(new Student("Shakya","Ranaweera",102333,"N0 12 Galle"));
        system1.listAllStudents();
        }
}
