
public class Student {
        public static void main(String[] args) {

        }
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String getName() {
                return name;
        }

        public void setName(String aName) {
                name = aName;
        }

        public int getStudentId() {
                return studentId;
        }
        public void setStudentId(int aStudentId) {
                studentId = aStudentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }
        public void setNumberOfCredits(int aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }
        public void setGpa(double aGpa) {
                gpa = aGpa;
        }
}
