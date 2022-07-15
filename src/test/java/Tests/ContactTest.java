package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContactTest extends BaseTest {

    @Test
    public void contactTest() {

        // De pe Homepage accesam butonul Contact;
        WebElement contact = Driver.findElement(By.xpath("//a[text()='Contact']"));
        contact.click();
        Actions action = new Actions(Driver);
        action.moveToElement(contact).click().perform();

        // Completam rubrica Contact Email;
        WebElement contactEmail = Driver.findElement(By.id("recipient-email"));
        String emailValue = "email.test@mail.com";
        contactEmail.sendKeys(emailValue);

        // Completam rubrica Contact Name;
        WebElement contactName = Driver.findElement(By.id("recipient-name"));
        String nameValue = "Popescu Eugen";
        contactName.sendKeys(nameValue);

        // Completam rubrica Message;
        WebElement contactMessage = Driver.findElement(By.id("message-text"));
        String messageValue = "Acesta este mesajul pe care il vom trimite";
        contactMessage.sendKeys(messageValue);

        // Accesam butonul "Send message";
        WebElement sendMessageButton = Driver.findElement(By.xpath("//button[text()='Send message']"));
        sendMessageButton.click();

        // Accesam butonul OK la alerta "Thanks for the message!!";
        Alert sendMessageAlert = Driver.switchTo().alert();
        sendMessageAlert.accept();
    }
}