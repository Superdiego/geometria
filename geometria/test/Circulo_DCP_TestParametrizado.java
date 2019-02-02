import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class Circulo_DCP_TestParametrizado {
	
	private double radio;
	private String circulo;
	
	public Circulo_DCP_TestParametrizado (double r) {		
		radio = r;

	}
	
	@Parameters
	public static Collection<Object[]> datos(){
		return Arrays.asList(new Object[][] {
			{7},{0},{-3}
		});
	}
	
	@Test
	public void test_perimetro() {
		Circulo_DCP micirculo = new Circulo_DCP (radio,circulo);
		
		if (radio<0){
			radio=-radio;
		};
		double per=radio*2*3.1416;
		assertEquals(per,micirculo.perimetro(),0);
	}
	
}
