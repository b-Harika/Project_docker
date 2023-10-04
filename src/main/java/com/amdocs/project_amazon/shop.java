package com.amdocs.project_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class shop {

	public static void main(String[] args) {
	FirefoxDriver dr = new FirefoxDriver();
	dr.get("http://www.google.com");
	dr.manage().window().maximize();
	dr.findElement(By.id("APjFqb")).sendKeys("amazon");
	dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	dr.findElement(By.cssSelector(".eKjLze > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > h3:nth-child(2)")).click();
	dr.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
	dr.findElement(By.id("nav-search-submit-button")).click();
	System.out.println("Search button clicked");
	dr.findElement(By.linkText("realme")).click();
	dr.findElement(By.linkText("₹5,000 - ₹10,000")).click();
	System.out.println("Selected price range");
	dr.navigate().to("https://www.amazon.in/realme-Feather-Segment-Charging-Slimmest/dp/B0C45VWDWJ/ref=sr_1_1?crid=3TBSIAH42ZLAX&keywords=Mobile&qid=1696409245&refinements=p_89%253Arealme%252Cp_36%253A1318505031&rnid=1318502031&s=electronics&sprefix=mo%252Caps%252C246&sr=1-1");
	dr.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	System.out.println("Added to cart");
	}

}