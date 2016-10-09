

import org.junit.Test;
import junit.framework.TestCase;
import records.StudentData;

/**
 * Unit test for simple App.
 */
public class StudentTest extends TestCase{

	private String testName = "Mick Jenkins";
	private Integer testAge = 30;
	private String testDOB = "1985-06-08";
	private StudentData s1;
	
	private String answer;
   
	public StudentTest( )
    {
       s1 = new StudentData(testName, testAge, testDOB);
       answer = testName.concat(testAge.toString()).replaceAll("\\s", "");
    }

	@Test
    public void testApp()
    {
        assertTrue( s1 != null );
        assertTrue( s1.getUserName().equals(answer));
        
    }
}
