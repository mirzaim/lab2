public class Lab {
    private Student[] students;
    private int dayOfTheWeek;
    private int currentCapacity;

    public Lab(int dayOfTheWeek, int capacity) {
        students = new Student[capacity];
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public void enrollStudent(Student std) {
        if (currentCapacity < students.length) {
            students[currentCapacity] = std;
            currentCapacity++;
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public float getAverage() {
        float total = 0;

        for (int i = 0; i < currentCapacity; i++) {
            total += students[i].getGrade();
        }

        return total / currentCapacity;
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }
}
