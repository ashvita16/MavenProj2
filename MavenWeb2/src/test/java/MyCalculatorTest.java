import static org.junit.Assert.*;

import org.junit.Test;
import com.jenk.MyCalculator;
public class MyCalculatorTest {


	@Test
	public void test1() {
		assertEquals(10,new MyCalculator().getSum(5,5));
	}
	
	@Test
	public void test2() {
		assertEquals(10,new MyCalculator().getSum(2,3));
	}
	
	@Test
	public void test3() {
		assertEquals(10,new MyCalculator().getDiff(10,5));
	}
}
