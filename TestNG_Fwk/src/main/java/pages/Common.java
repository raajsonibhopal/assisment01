package pages;

public class Common extends base_element {
	
	
	


	public static void searchProduct(String data) {
		inputBox(driver).sendKeys(data);
		searchButtonP(driver).click();
		inputBox(driver).clear();
		

	}

	public static void submitSearchP() {
		searchButtonF(driver).click();
	}

	public static void searchProductP(String data) {
		inputBox(driver).sendKeys(data);
		searchButtonF(driver).click();
		inputBox(driver).clear();

	}
	
	
	
	public static void contactClick() {
		Contect_Btn(driver).click();
	}
	public static void click_into_sign_in() {

		click_into_sign_in(driver).click();
		click_onto_HomeMakingAPurchase(driver).click();
	}
	
	
	
	
	
	
	 
	public static void clickONHelpMAking() {
		click_onto_HomeMakingAPurchase(driver).click();
		
	}
	
	
}
