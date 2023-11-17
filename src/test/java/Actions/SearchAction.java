package Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Locators.SearchLocator;
import Utility.HelperClass;

public class SearchAction {
static SearchLocator searchlocator = null;
	
	public SearchAction() {
		this.searchlocator= new SearchLocator();
		PageFactory.initElements(HelperClass.getDriver(), searchlocator);
	}
	
	public static void setSearch(String product, Keys enter) {
          searchlocator.search.sendKeys(product);
	}

}
