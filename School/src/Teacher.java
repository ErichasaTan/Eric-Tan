public class Teacher {
    String firstName;
    String lastName;
    String subjectName;

    Teacher(String firstName, String lastName, String subjectName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectName = subjectName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public String toString(){
        return "Name: " + getName()+ " Subject: " + subjectName;
    }


}
