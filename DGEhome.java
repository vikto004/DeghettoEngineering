package DGEfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DGEhome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://deghetto2.com/");
			//Verify title
			String actualTitle = driver.getTitle();
			String expectedTitle= "History - DeGhetto Engineering";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
				System.out.println("Home page Title Matched");
			else
				System.out.println("Title doesn't match");
	    
			//Verify secondary menu
			if(!driver.findElements(By.id("secondarymenu")).isEmpty()){
				System.out.println("DELETE SECONDARY MENU");
		    }else{
		    }
		
		driver.findElement(By.linkText("Services")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[2]/p[2]/a[1]/img")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[2]/p[2]/a[2]/img")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[2]/p[2]/a[3]/img")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div/div[2]/p[2]/a[4]/img")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Equipment")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Contact Us")).click();
			if(driver.findElement(By.className("feedback"))!= null){
				System.out.println("Contact form is Present");
			}else{
				System.out.println("NO CONTACT FORM");
			}
			
		driver.findElement(By.className("feedback")).click();
			if(driver.findElement(By.className("feedback"))!= null){
				System.out.println("Map form is Present");
			}else{
				System.out.println("NO MAP IS PRESENT");
			}
		
		driver.findElement(By.linkText("Read More")).click();
			if(driver.findElement(By.linkText("Read More"))!= null){
				System.out.println("REMOVE LINK OR FIX IN TOGGLE ELEMENT");
			}else{
				System.out.println("NO LINKS IN TOGGLE ELEMENT");
			}
			
		driver.close();
//		driver.findElement(By.linkText("DeGhetto History")).click();
//		Thread.sleep(3000);
//			String actualTitle2 = driver.getTitle();
//			String expectedTitle2 = "History - DeGhetto Engineering";
//				if (actualTitle.equalsIgnoreCase(expectedTitle2))
//					System.out.print("History title matches");
//				else
//					System.out.println("History link title didn't match");
				
				
					
			
	}

}
