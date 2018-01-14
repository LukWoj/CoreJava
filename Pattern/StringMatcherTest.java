import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringMatcherTest
{
	private StringMatcher m;
	
	@Before
	private void setup()
	{
		m = new StringMatcher();
		
	}
	
	@Test
	public void testIsTrue()
	{
		assertTrue(m.isTrue("true"));
		assertFalse(m.isTrue("true2"));
		assertFalse(m.isTrue("True"));
	}

	@Test
	public void testIsTrue2()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsTrue3()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsTrue4()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsTrue5()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsNoNumberAtBeginning()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsIntersection()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testIsLessThenThreeHundred()
	{
		fail("Not yet implemented");
	}

}
