public class Student {
    String firstName;
    String lastName;
    int Grade;
    public static int studentNumber = 0;
    public int personalID;
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        Grade = grade;
        studentNumber++;
        this.personalID = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public int getGrade(){
        return Grade;
    }

    public void setGrade(int grade){
        Grade = grade;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public int getPersonalID(){
        return personalID;
    }

    public void setPersonalID(int personalID){
        this.personalID = personalID;
    }

    @Override
    public String toString() {
        return "Name: " +getName() +" Grade: " +Grade;
    }
}
