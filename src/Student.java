public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private float grade;

    public Student(String firstName, String lastName, String studentID){

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setGrade(float grade){
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStudentID() {
        return studentID;
    }

    public float getGrade() {
        return grade;
    }

    public String getInfo(){
        String result = "";
        result += "Name: " + firstName + " " + lastName + "\n";
        result += "Student ID: " + studentID + "\n";
        result += "Grade: " + grade;
        return result;
    }
}
