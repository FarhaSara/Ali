package demos;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDataProvider {

	@DataProvider (name = "data-provider")
	public Object[][] dpMethod (){
		
			return new Object[][] {{2, 3 }, {5, 7},{1,2}};
		
		
	}
	
	@Test (dataProvider = "data-provider")
	 public void Sum (int a, int b, int c) {
	      int sum = a + b+c;
	     System.out.println(sum);
	 }
	  
		/*
		 * @Test (dataProvider = "data-provider") public void Diff (int a, int b, int
		 * result) { int diff = a - b; System.out.println(diff); }
		 */
}

