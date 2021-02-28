package ensta;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class BoardTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BoardTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BoardTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Board b = new Board("Andres");

        assertTrue( true );
    }
}