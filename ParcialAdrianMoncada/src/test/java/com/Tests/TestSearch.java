package com.Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import com.Pages.PageSearch;

public class TestSearch {
	
	WebDriver driver;
	PageSearch pageSearch;
	
	
	@BeforeEach
	public void setUp () throws InterruptedException
	{
		pageSearch = new PageSearch(driver);
		driver = pageSearch.chromeDriverConnection();
		pageSearch.link("http://opencart.abstracta.us/index.php?route=common/home");
		
	}

	@Test
	public void test() throws InterruptedException
	{		
		pageSearch.search();
	}
	
	
	@AfterEach
	public void tearDown() {
		driver.quit();
	}
	

}
