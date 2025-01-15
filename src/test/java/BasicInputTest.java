import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

/**
 * The test class SkillBuilder3Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BasicInputTest extends OutputTest
{
    /**
     * Default constructor for test class SkillBuilder2Test
     */
    public BasicInputTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        super.setUp();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        super.tearDown();
    }

    @Test
    @DisplayName("[1] test main 1")
    public void testMain_1()
    {
        setTestInput("99\n3.77\nz\nHowdy");
        BasicInput.main(new String[]{});
        String expected = "Enter integer:\n" +
                "Enter double:\n" +
                "Enter character:\n" +
                "Enter string:\n" +
                "99 3.77 z Howdy\n" +
                "Howdy z 3.77 99\n" +
                "3.77 cast to an integer is 3";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);
    }

    @Test
    @DisplayName("[1] test main 2")
    public void testMain_2()
    {
        setTestInput("54\n6.02\nm\nBye");
        BasicInput.main(new String[]{});
        String expected = "Enter integer:\n" +
                "Enter double:\n" +
                "Enter character:\n" +
                "Enter string:\n" +
                "54 6.02 m Bye\n" +
                "Bye m 6.02 54\n" +
                "6.02 cast to an integer is 6";
        String actual = getTestOutput();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);
    }
}
