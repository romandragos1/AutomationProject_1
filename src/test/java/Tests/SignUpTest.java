package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SignUpTest extends BaseTest {

    @Test
    public void signUp() throws InterruptedException {

        // De pe Homepage accesam butonul "Sign Up";
        WebElement signUpElement = Driver.findElement(By.id("signin2"));
        signUpElement.click();

        // Completam rubrica "Username";
        WebElement usernameElementSignup = Driver.findElement(By.id("sign-username"));
        String usernameElementSignupValue = "test.test11";
        usernameElementSignup.sendKeys(usernameElementSignupValue);

        // Completam rubrica "Password";
        WebElement passwordElementSignup = Driver.findElement(By.id("sign-password"));
        String passwordElementSignupValue = "pass.pass";
        passwordElementSignup.sendKeys(passwordElementSignupValue);

        // Accesam butonul "Sign Up";
        WebElement signUpButton = Driver.findElement(By.xpath("//button[@onclick='register()']"));
        signUpButton.click();
        Thread.sleep(800);

        // Accesam butonul OK la alerta "Sign Up successful";
        Alert signUpAlert = Driver.switchTo().alert();
        signUpAlert.accept();
    }
}