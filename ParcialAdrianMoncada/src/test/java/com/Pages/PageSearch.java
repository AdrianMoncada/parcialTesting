package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Base.BasePage;

public class PageSearch extends BasePage{
	
	By searchBox = By.xpath("/html/body/header/div/div/div[2]/div/input");
	By bottonSearch = By.cssSelector(".input-group-btn");
	By resultado = By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[1]/h4/a");
	By bottonAddCard = By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button[1]");
	By resultado2 = By.xpath("/html/body/div[2]/div[1]");
	
	
	public PageSearch(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void search () throws InterruptedException {
		teclear("iphone",searchBox);
		Thread.sleep(100);
		oprimir(bottonSearch);
		Thread.sleep(100);
		obtenerTexto(resultado);
		Thread.sleep(100);
		comparar(resultado,"iPhone");
		Thread.sleep(100);
		oprimir(bottonAddCard);
		Thread.sleep(100);
		obtenerTexto(resultado2);
		Thread.sleep(100);
		comparar(resultado2,"Success: You have added iPhone to your shopping cart!");
	}

}

