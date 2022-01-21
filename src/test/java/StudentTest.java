import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
//    private long id;
//    private String name;
//    private ArrayList<Integer> grades;
    private Student eva;


    @Before
    public void createStudent() {
        eva = new Student(1, "Eva");
        
    }

    @Test
    public void testId() {
        Assert.assertEquals(1, eva.getId());
    }

}
