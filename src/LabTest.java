public class LabTest {
    public static void main(String[] args) {
        Lab ap = new Lab(2, 30);

        Student morteza = new Student("Morteza", "Mirzai", "9731064");
        morteza.setGrade((float) 19.3);

        System.out.println(morteza.getInfo());

        //enroll someone
        ap.enrollStudent(morteza);

        System.out.println("Current capacity is " + ap.getCurrentCapacity()
                + " On " + ap.getDayOfTheWeek() + " days");
    }
}
