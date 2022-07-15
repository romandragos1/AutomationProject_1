package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartTest extends BaseTest {

    @Test
    public void cartTest() throws InterruptedException {

        // De pe Homepage accesam un produs;
        WebElement product = Driver.findElement(By.xpath("//a[text()='HTC One M9']"));
        Actions actions = new Actions(Driver);
        actions.moveToElement(product).perform();
        product.click();

        // De pe pagina produsului accesam butonul "Add to cart";
        WebElement productHtc = Driver.findElement(By.xpath("//a[text()='Add to cart']"));
        productHtc.click();
        Thread.sleep(800);

        // Accesam butonul OK la alerta "Product added";
        Alert productAdded = Driver.switchTo().alert();
        productAdded.accept();

        // Accesam cosul de cumparaturi "Cart";
        WebElement cart = Driver.findElement(By.id("cartur"));
        cart.click();

        // Accesam butonul "Place Order";
        WebElement placeOrder = Driver.findElement(By.xpath("//button[@class='btn btn-success']"));
        placeOrder.click();

        // Completam rubrica Place Order -> "Name";
        WebElement nameOrder = Driver.findElement(By.id("name"));
        String nameOrderValue = "Dragos Roman";
        nameOrder.sendKeys(nameOrderValue);

        // Completam rubrica Place Order -> "Country";
        WebElement countryOrder = Driver.findElement(By.id("country"));
        String countryOrderValue = "Romania";
        countryOrder.sendKeys(countryOrderValue);

        // Completam rubrica Place Order -> "City";
        WebElement cityOrder = Driver.findElement(By.id("city"));
        String cityOrderValue = "Cluj-Napoca";
        cityOrder.sendKeys(cityOrderValue);

        // Completam rubrica Place Order -> "Credit Card Number";
        WebElement creditCardOrder = Driver.findElement(By.id("card"));
        String creditCardOrderValue = "4140-5845-2541-0021";
        creditCardOrder.sendKeys(creditCardOrderValue);

        // Completam rubrica Place Order -> "Credit Card Month";
        WebElement creditCardMonth = Driver.findElement(By.id("month"));
        String creditCardMonthValue = "05";
        creditCardMonth.sendKeys(creditCardMonthValue);

        // Completam rubrica Place Order -> "Credit Card Year";
        WebElement creditCardYear = Driver.findElement(By.id("year"));
        String creditCardYearValue = "2025";
        creditCardYear.sendKeys(creditCardYearValue);

        // Accesam butonul "Purchase" pentru a finaliza tranzactia;
        WebElement purchase = Driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']"));
        purchase.click();
        Thread.sleep(800);

        // Accesam butonul "OK" confirmare comanda;
        WebElement purchaseOk = Driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']"));
        purchaseOk.click();
    }
}