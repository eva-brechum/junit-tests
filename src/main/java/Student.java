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


    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public ArrayList<Integer> getGrades() {
            return grades;
    }
}

