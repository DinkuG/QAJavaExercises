package QAC.Project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class exampleTest extends example{
	
	@Test //output35(int k)
	public void allTest() {
		example e = new example();
		
		assertEquals(" 1 2 fizz 4 buzz", e.output35(5));
	}
	@Test// select35(int p) 
	public void eachTest() {
		example e = new example();
		
		assertEquals(" fizz", e.select35(3));
		assertEquals(" buzz", e.select35(5));
		assertEquals(" fizzbuzz", e.select35(15));
		assertEquals(" 1", e.select35(1));
		
	}

}
