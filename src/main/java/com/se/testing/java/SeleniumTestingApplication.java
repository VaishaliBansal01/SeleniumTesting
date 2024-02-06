package com.se.testing.java;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class SeleniumTestingApplication {

	public static void main(String[] args) throws IOException, TesseractException, InterruptedException {
		SpringApplication.run(SeleniumTestingApplication.class, args);

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//for capcha handelling
//		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104188%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D12161864858106507491%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9302964%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2371562&prevRID=71X2X212EBFCHCWBRRF0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);

//		Tesseract tesseract = new Tesseract();
//		tesseract.setDatapath("C:\\Users\\ongraph pc\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");

//		if(title.equals("Google"))
//		{
//			System.out.println("correct title");
//		}
//		else {
//			System.out.println("incorrect title");
//		}

		System.out.println(driver.getCurrentUrl());

//		driver.quit();

		//a-box a-color-offset-background
	/*	WebElement element = driver.findElement(By.className("a-box"));

		if(element.isDisplayed()) {
			try {
//				WebElement capchaElement = driver.findElement(By.xpath(".//*[@class='a-box-inner']/div[1]"));

				WebElement capchaElement = driver.findElement(By.xpath(".//*[@class='a-box-inner']/div[1]"));

				File src = capchaElement.getScreenshotAs(OutputType.FILE);

				String path = "C:\\Users\\ongraph pc\\Downloads\\SeleniumTesting\\SeleniumTesting\\capchaimages\\capcha.png";

				FileHandler.copy(src, new File(path));

//				ITesseract image = new Tesseract();
//		 String str = image.doOCR(new File(path));
				String str = tesseract.doOCR(new File(path));
				//.//*[@id='captchacharacters']

//				driver.findElement(By.xpath(".//*[@id='captchacharacters']")).sendKeys(str);
				driver.findElement(By.id("captchacharacters")).sendKeys(str);

				System.out.println(str);
				System.out.println("img ocr");

				//Continue shopping

				Thread.sleep(1000);

				driver.findElement(By.xpath("//button[contains(text(),'Continue shopping')]")).click();

//				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{


		}

*/
	//APjFqb
		driver.findElement(By.id("APjFqb")).sendKeys("Java");

		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		System.out.println("total suggestions in search box :"+list.size());

		for(int i=0; i< list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}


	}

}
