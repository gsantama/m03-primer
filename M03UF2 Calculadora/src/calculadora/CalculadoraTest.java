package calculadora;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest {

	private int num1;
	private int num2;
	private int result;
	public CalculadoraTest(int num1,int num2, int result) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}
	
	@Parameters
	public static Collection<Object[]>numeros(){
		return Arrays.asList(new Object[][]{
			{20,10,30},
			{30,-2,28},
			{5,2,7}
		});
		}

	
	@Test
	public void testMultiplicacio() {
	//	fail("Not yet implemented");
	}

	@Test
	public void testDivisio() {
		int res = Calculadora.divisio(12, 0);
		assertEquals(12,res);
		res = Calculadora.divisio(12, 2);
		assertEquals(6,res);
		//res = Calculadora.divisio(12, 0);
		//assertEquals(0,res);

//		fail("Not yet implemented");
	}

	@Test
	public void testSuma() {
		int res = Calculadora.suma(num1,num2);
		assertEquals(result,res);
	}
}
