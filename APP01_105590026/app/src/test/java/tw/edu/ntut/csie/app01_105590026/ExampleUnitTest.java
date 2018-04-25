package tw.edu.ntut.csie.app01_105590026;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private letterGrade ls;

    @Before
    public void setUp(){
        ls = new letterGrade();
    }

    @After
    public void tearDown(){
        ls = null;
    }
    @Test
    public void addition_isCorrect() {
        assertEquals("等第：grade='X'",ls.letterGrade(101));
        assertEquals("等第：grade='A'",ls.letterGrade(100));
        assertEquals("等第：grade='B'",ls.letterGrade(89));
        assertEquals("等第：grade='C'",ls.letterGrade(79));
        assertEquals("等第：grade='D'",ls.letterGrade(69));
        assertEquals("等第：grade='F'",ls.letterGrade(59));
        assertEquals("等第：grade='X'",ls.letterGrade(-1));
    }
}