package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindDataTypes 
{
	public static String findDataType(Object o)
	{
		if(o instanceof Float)
		{
			System.out.println("The object is of type Float");
			return "Float";
		}
		else if(o instanceof Byte)
		{
			System.out.println("The object is of type Byte");
			return "Byte";
		}
		else if(o instanceof Short)
		{
			System.out.println("The object is of type Short");
			return "Short";
		}
		else if(o instanceof Integer)
		{
			System.out.println("The object is of type Integer");
			return "Integer";
		}
		else if(o instanceof Long)
		{
			System.out.println("The object is of type Long");
			return "Long";
		}
		
		else if(o instanceof Character)
		{
			System.out.println("The object is of type Character");
			return "Character";
		}
		
		else if(o instanceof Double)
		{
			System.out.println("The object is of type Double");
			return "Double";
		}
		
		else
			return "not valid";
		}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findDataType('s'), "Character");
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findDataType((byte)8), "Byte");
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(findDataType((short)-1234), "Short");
	}
	
	@Test
	public void testCase4()
	{
		Assert.assertEquals(findDataType(23.4f), "Float");
	}
	
	@Test
	public void testCase5()
	{
		Assert.assertEquals(findDataType(89000), "Integer");
	}
	@Test
	public void testCase6()
	{
		Assert.assertEquals(findDataType(89345.6254d), "Double");
	}
	
	@Test
	public void testCase7()
	{
		Assert.assertEquals(findDataType(8934562340987654l), "Long");
	}

}
