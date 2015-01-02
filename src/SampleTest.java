import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest 
{
	/*3rd Chapter learning*/
	
	@Test
	public void testEquality() 
	{
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
}
