import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class StudentTest {

    private Student eva;


    @Before
    public void createStudent() {
        eva = new Student(1, "Eva");
        
    }

    @Test
    public void testId() {
        Assert.assertEquals(1, eva.getId());
    }

    @Test
    public void testName() {
        Assert.assertEquals("Eva", eva.getName());
    }

    @Test
    public void testGrades() {
        Assert.assertEquals(90, eva.getGrades().size());
    }
    @Test
    public void testAddGrades() {
        eva.addGrade(90);
        Assert.assertEquals(90, (int) eva.getGrades().get(0));
    }

    @Test
    public void testGetAverage() {
        Assert.assertEquals(0.0, eva.getAverage(), 0.0);
//        eva.addGrade(85);
//        eva.addGrade(88);
//        eva.addGrade(90);
    }
}
