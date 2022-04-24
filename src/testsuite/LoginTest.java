package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter username and password
        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        sendTextToElement(By.xpath("//input[@id='username']"), "tomsmith");
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        sendTextToElement(By.xpath("//input[@id='password']"), "SuperSecretPassword");
        // Click login button
        //driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));
        //driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]")).click();
        clickOnElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]"));
    }

    @Test
    public void verifyTheUsernameErrorMessage(){
        // Enter username and password
        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith1");
        sendTextToElement(By.xpath("//input[@id='username']"), "tomsmith1");
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
        sendTextToElement(By.xpath("//input[@id='password']"), "SuperSecretPassword!");
        // Click login button
        //driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));
        //driver.findElement(By.xpath("//div[@id='flash']")).click();
        clickOnElement(By.xpath("//div[@id='flash']"));

    }

    @Test
    public void verifyThePasswordErrorMessage(){
        // Enter username and password
        //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
        sendTextToElement(By.xpath("//input[@id='username']"), "tomsmith");
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword");
        sendTextToElement(By.xpath("//input[@id='password']"), "SuperSecretPassword");
        // Click login button
        //driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
        clickOnElement(By.xpath("//i[contains(text(),'Login')]"));
        //driver.findElement(By.xpath("//div[@id='flash']")).click();
        clickOnElement(By.xpath("//div[@id='flash']"));

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}




