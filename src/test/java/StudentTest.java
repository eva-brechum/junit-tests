import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    private long id;
    private String name;
    private ArrayList<Integer> grades;
    Student eva;

    @Before
    public void createStudent() {
        eva = new Student();
        ;
    }

    @Test
    public void testId() {
        Assert.assertEquals(Student.getId());

    }

}
