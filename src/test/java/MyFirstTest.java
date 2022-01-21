
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    @Test
    public void isCodeupCodeUp() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }
    @Test
    public void davidIsDavid() {
        String instructor = "David";
        String testWriter = "David";

        Assert.assertEquals(instructor, testWriter); //assertEquals checks if objects have same value
    }

    @Test
    public void listsAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> names = new ArrayList<>();
        languages.add("Latin");
        names.add("Latin");
//        Assert.assertEquals(languages, names);
        Assert.assertNotSame(languages, names); // assertSame checks if two objects are the same
    }
    @Test
    public void arraysAreEqual() {
        int[] numbers = {1,2,3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        Assert.assertArrayEquals(numbers, otherNumbers); //assertArrayEquals check individual elements in the array
    }

    @Test
    public void funWithPHP() {
        String language = "PHP";
        Assert.assertTrue(language.contains("H"));// Both> Note: only one Assert in a method to test, not two;
        Assert.assertFalse(language.contains("J"));// Both > conditions must be true to pass.

    }
}
