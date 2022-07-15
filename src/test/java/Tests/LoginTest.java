package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void logIn() {

        // De pe Homepage accesam butonul "Log In";
        WebElement logInElement = Driver.findElement(By.id("login2"));
        logInElement.click();

        // Completam rubrica "Username";
        WebElement usernameElementLogin = Driver.findElement(By.id("loginusername"));
        String usernameElementLoginValue = "test.test8";
        usernameElementLogin.sendKeys(usernameElementLoginValue);

        // Completam rubrica "Password";
        WebElement passwordElementLogin = Driver.findElement(By.id("loginpassword"));
        String passwordElementLoginValue = "pass.pass";
        passwordElementLogin.sendKeys(passwordElementLoginValue);

        // Accesam butonul "Log In";
        WebElement logInButton = Driver.findElement(By.xpath("//button[@onclick='logIn()']"));
        logInButton.click();
    }
}