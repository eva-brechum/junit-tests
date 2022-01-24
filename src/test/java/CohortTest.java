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
       Cohort  killua = new Cohort();
        Student eva = new Student (1, "eva");
        Student gon = new Student(2, "gon");
    }

    @Test
    public void testAddStudent() {
        Student eva = new Student (1, "eva");
        Student gon = new Student(2, "gon");
        Cohort killua = new Cohort();
        Cohort hisoka = new Cohort();
        killua.addStudent(eva);

        Assert.assertEquals(1,killua.getStudents().size());
        Assert.assertEquals(2, hisoka.getStudents().size());
    }

    @Test
    public void testGetStudents() {
//        Student eva = new Student(1, "eva");
//        Student gon = new Student (2, "gon");
//        Cohort killua = new Cohort();
////        Cohort hisoka = new Cohort();

        Assert.assertEquals(1, killua.getStudents().get(0));
    }
}
