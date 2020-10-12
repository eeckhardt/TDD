package Tdd_Fizz_Buzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {
	

	@Test
	
	public void testNumerosMenores()
	{
		FizzBuzz fb = new FizzBuzz();
		Assertions.assertEquals("1",fb.converte(1));
	}


}
