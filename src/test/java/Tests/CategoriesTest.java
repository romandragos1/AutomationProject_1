package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesTest extends BaseTest {

    @Test
    public void categoriesTest() throws InterruptedException {


        // De pe Homepage accesam butonul Categories -> Phones;
        WebElement categoriesPhones = Driver.findElement(By.linkText("Phones"));
        categoriesPhones.click();

        // De pe Homepage accesam butonul Categories -> Laptops;
        WebElement categoriesLaptops = Driver.findElement(By.linkText("Laptops"));
        categoriesLaptops.click();

        // De pe Homepage accesam butonul Categories -> Monitors;
        WebElement categoriesMonitors = Driver.findElement(By.linkText("Monitors"));
        categoriesMonitors.click();

        // Vizualizam produsele de pe Homepage prin accesare buton Next;
        Driver.navigate().refresh();
        WebElement nextButtonProduct = Driver.findElement(By.id("next2"));
        nextButtonProduct.click();
        Thread.sleep(800);

        // Vizualizam produsele de pe Homepage prin accesare buton Previous
        WebElement previousButtonProduct = Driver.findElement(By.id("prev2"));
        previousButtonProduct.click();
        Thread.sleep(800);

        // Vizualizam produsele promovate pe Homepage in Carousel - Homepage prin accesare buton Next x 2;
        WebElement nextCarouselButton = Driver.findElement(By.xpath("//span[@class='carousel-control-next-icon']"));
        nextCarouselButton.click();
        Thread.sleep(800);
        nextCarouselButton.click();
        Thread.sleep(800);

        // Vizualizam produsele promovate pe Homepage in Carousel - Homepage prin accesare buton Previous x 2;
        WebElement previousCorouselButton = Driver.findElement(By.xpath("//span[@class='carousel-control-prev-icon']"));
        previousCorouselButton.click();
        Thread.sleep(800);
        previousCorouselButton.click();
        Thread.sleep(800);
    }
}