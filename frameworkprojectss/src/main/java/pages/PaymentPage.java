package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
WebDriver driver;

 By cardName = By.xpath("//*[@id=\"payment-form\"]/div[1]/div");
 By cardNo = By.xpath("//*[@id=\"payment-form\"]/div[2]/div");
 By cvcNo   = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]");
 By expMonth  = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]");
 By yearBox = By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]");
 By placeOrder = By.xpath("//button[@id='submit']");
 
 public PaymentPage(WebDriver driver) {
	 this.driver=driver;
 }
 
 public void orderPayment(String cardname,String cardno,String cvcno,String month,String year) {
	 driver.findElement(cardName).sendKeys(cardname);
	 driver.findElement(cardNo).sendKeys(cardno);
	 driver.findElement(cvcNo).sendKeys(cvcno);
	 driver.findElement(expMonth).sendKeys(month);
	 driver.findElement(yearBox).sendKeys(year);
	 driver.findElement(placeOrder).click();
 }
 
}
