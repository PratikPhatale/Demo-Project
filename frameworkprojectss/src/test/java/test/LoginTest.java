package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.AddToCart;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.PlaceOrderPage;

@Listeners(utility.ListenerClass.class)
public class LoginTest extends BaseClass{

    @Test
    public void loginTest() {
    	
        LoginPage lp = new LoginPage(driver);
        lp.clickLoginLink();
        lp.login(prop.getProperty("email"), prop.getProperty("password"));

        HomePage hp = new HomePage(driver);
        System.out.println("Logged in user: " + hp.getLoggedInUser());
        
        AddToCart ap = new AddToCart(driver);
        ap.addFirstProductToCart();
        
        PlaceOrderPage po = new PlaceOrderPage(driver);
        po.checkout();
        
        PaymentPage pp = new PaymentPage(driver); 
        pp.orderPayment(
        		 prop.getProperty("cardname"),
                 prop.getProperty("cardno"),
                 prop.getProperty("cvcno"),
                 prop.getProperty("month"),
                 prop.getProperty("year")
        		);
    }

    }


