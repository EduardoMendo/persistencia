import dao.StudentDao;
import models.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao daoStudent = new StudentDao();
        Student student = new Student();

        student.setName("Andrea Cuadra");
        student.setId(220113L);
        student.setMajor("Ingenieria en sistemas");
        student.setName("Angel Moreno");
        student.setId(224143L);
        student.setMajor("Ingenieria en sistemas");
        daoStudent.save(student);
    }
}
