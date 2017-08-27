
public class Student {

        private String firstName;
        private String middleName;
        private String lastName;
        private int course;
        private String specialty;
        private String university;
        private String email = null;
        private long phone = 0L;
        public static int countStudent;

        public Student() {
                this.firstName = "Pesho";
                countStudent++;
        }


        public Student(String name) {
               this.firstName = name;
                countStudent++;
        }

        public Student(String name, String middle, String last) {
                this.firstName = name;
                this.middleName = middle;
                this.lastName = last;
                countStudent++;
        }

        public Student(int course, String spec, String university) {
                this();
                this.course = course;
                this.specialty = spec;
                this.university = university;
        }

        public void getStudentInfo() {
                System.out.println();
                System.out.printf("The full name on student is " + this.firstName + " " + this.middleName + " " + this.lastName);
                System.out.printf("\nThe student is the " + this.course + " course in a " + this.specialty + " in a " + this.university);
                System.out.println("\nThe student phone number is " + this.phone + "\nAnd email is " + this.email);
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getMiddleName() {
                return middleName;
        }

        public void setMiddleName(String middleName) {
                this.middleName = middleName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public int getCourse() {
                return course;
        }

        public void setCourse(int course) {
                this.course = course;
        }

        public String getSpecialty() {
                return specialty;
        }

        public void setSpecialty(String specialty) {
                this.specialty = specialty;
        }

        public String getUniversity() {
                return university;
        }

        public void setUniversity(String university) {
                this.university = university;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public long getPhone() {
                return phone;
        }

        public void setPhone(long phone) {
                this.phone = phone;
        }

        public static void getNumberOfStudents() {
                System.out.println();
                System.out.println("The number of student is: " + countStudent);
        }
}
