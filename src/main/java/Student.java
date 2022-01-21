import java.util.ArrayList;

//the Student class:
//
// id should be a long number used to represent a "unique user" in our application.
//name is a String that holds the name of the student.
//grades is an ArrayList that contains a list of Integer numbers.
public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;


    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

//        ArrayList<Integer>grades = new ArrayList<>();


    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    public void addGrade(int grade) {

    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getAverage() {
        double sum = 0.0;
        for (int grade: this.grades){
            sum += grade;
        }
       return sum /this.grades.size();
    }

}



