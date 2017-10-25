package QAC.Project;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzTest extends Fizz {
	FizzTest fiz;
	
//	@Before
//	public void iniTest() {
//		  fiz = new FizzTest();		
//	}
//	@Test
//	public void TestFizzBuzz() {
//		assertEquals("fizzbuzz",fiz.fizzbuzzMethod());
//	}
//	@Test
//	public void TestBuzz() {
//		assertEquals("buzz",fiz.buzzMethod());
//	}
//	
//	@Test
//	public void TestFizz() {		
//		assertEquals("fizz",fiz.fizzMethod());
//	}
//	
//	@Test
//	public void TestIntValues() {
//		fiz.intMethod();
//	}
//	@Test
//	public void outputFB() {
//		fiz.printfizzbuzz();
//	}
//	
	@Test
	public void testFB() {
		Fizz f = new Fizz();
	String output = f.fizzBuzz(5);
	assertEquals(" 1 2 fizz 4 buzz",output);
	}
	
	@Test 
	public void testFBMethod() {
		Fizz f = new Fizz();
		String output = f.fizzOrBuzzOrBoth(5);
		assertEquals(" buzz", output);

		output = f.fizzOrBuzzOrBoth(3);
		assertEquals(" fizz", output);

		output = f.fizzOrBuzzOrBoth(15);
		assertEquals(" fizzbuzz", output);

		output = f.fizzOrBuzzOrBoth(2);
		assertEquals(" 2", output);
	}

	
}//class
