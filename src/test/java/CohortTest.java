import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CohortTest {
//
//    Cohort hisoka;
    Cohort killua;
    Student eva;
    Student gon;

    @Before
    public void createCohort() {
         killua = new Cohort();
         eva = new Student (1, "eva");
         gon = new Student(2, "gon");

         eva.addGrade(98);
         eva.addGrade(86);
    }

    @Test
    public void addStudentTest() {

        Student eva = new Student (1, "eva");
        Student gon = new Student(2, "gon");
        Cohort killua = new Cohort();
        Cohort hisoka = new Cohort();
        killua.addStudent(eva);
        Assert.assertEquals(1,killua.getStudents().size());
        Assert.assertEquals(2, hisoka.getStudents().size());
    }

    @Test
    public void getStudentsTest() {
//        Student eva = new Student(1, "eva");
//        Student gon = new Student (2, "gon");
//        Cohort killua = new Cohort();
////        Cohort hisoka = new Cohort();

        Assert.assertNotSame(1, killua.getStudents().get(1).getId());
    }
    @Test
    public void cohortAverageTest() {
        Assert.assertEquals(98, killua.getCohortAverage(),1);
    }

}
