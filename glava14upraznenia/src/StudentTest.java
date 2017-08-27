
public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Georgiev", "Ivanov");
        Student student2 = new Student("Georgi", "Petrov", "Georgiev");
        Student student3 = new Student(3, "Finance", "UNSS");

        student1.setPhone(+359877243647L);
        student1.getStudentInfo();
        student2.setSpecialty("Finance");
        student2.getStudentInfo();
        student3.getStudentInfo();

        createNewStudents("Filip", "Todor", "Maria");

        Student.getNumberOfStudents();
    }

    public static void createNewStudents(String... name) {
        for (String nStudent : name) {
            Student newStudent = new Student(nStudent);
            newStudent.setPhone(+359874132648L);
            newStudent.getStudentInfo();
        }
    }
}
