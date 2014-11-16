import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests for the Test10
 */
public class Test10Test 
extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Test10Test( String testName )
    {
        super( testName );
    }

    /** 
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Test10Test.class );
    }

    /**
     * Simple Test :-)
     */
    public void test_Simple()
    {
        String[] args = {""};        
        String expectedResult = "Hello world" + "\n";

        ByteArrayOutputStream myOutStream = new ByteArrayOutputStream();
        PrintStream stdout = System.out;
        System.setOut(new PrintStream(myOutStream));

        Test10.main(args);
        
        String actualResult = myOutStream.toString();

        assertEquals(expectedResult, actualResult);
    }
}
