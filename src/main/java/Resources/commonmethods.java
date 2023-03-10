package Resources;

import org.testng.asserts.SoftAssert;

public class commonmethods {
	
	public static void handleassertion(String Actual,String Expected,String message) {
		
		SoftAssert a=new SoftAssert();
		
		String Ac=Actual;
		String Expt=Expected;
		
		a.assertEquals(Ac,Expt,"error message not matching");
		a.assertAll();
	}

}
