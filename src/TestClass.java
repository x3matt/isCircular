import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TestClass {
    isCircularChecker checker  = new isCircularChecker();

    @Test
    public void testIsCircular_valid() throws Exception{
        String s1 = "String";
        String s2 = "gStrin";
        String s3 = "ngStri";
        assertTrue(checker.isCircular(s1,s2));
        assertTrue(checker.isCircular(s2,s3));
        assertTrue(checker.isCircular(s1,s3));
    }
    @Test
    public void testIsCircular_invalid() throws Exception{
        String s1 = "Test";
        String s2 = "sTet";
        assertFalse(checker.isCircular(s1,s2));
    }
    @Test(expected = NullPointerException.class)
    public void testIsCircular_NullPointerException_x1() throws Exception{
        checker.isCircular(null,"word");
    }
    @Test(expected = NullPointerException.class)
    public void testIsCircular_NullPointerException_x2() throws Exception{
        checker.isCircular("word",null);
    }
    @Test(expected = InvalidLengthException.class)
    public void testIsCircular_InvalidLingthException() throws Exception{
        checker.isCircular("word","wordd");
    }
}
