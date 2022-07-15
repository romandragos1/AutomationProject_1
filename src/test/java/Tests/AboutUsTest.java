package Tests;

import Base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutUsTest extends BaseTest {

    @Test
    public void aboutUs() throws InterruptedException {

        // De pe Homepage accesam butonul "About us";
        WebElement aboutUs = Driver.findElement(By.xpath("//a[text()='About us']"));
        aboutUs.click();

        // Accesam butonul "Play" al video-ului de prezentare;
        WebElement playAboutUs = Driver.findElement(By.xpath("//button[@class='vjs-big-play-button']"));
        playAboutUs.click();
        Thread.sleep(5000);     // Rulam clipul timp de 5 sec

        // Inchidem pagina "About us";
        WebElement closeAboutUs = Driver.findElement(By.xpath("//*[@id=\"videoModal\"]/div/div/div[3]/button"));
        closeAboutUs.click();
    }
}