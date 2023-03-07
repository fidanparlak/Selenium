package day09_exel_screenshot_jsExecutor;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C06_ReusableMethodsTumSayyfa extends TestBase {
   @Test
   public void test01() throws IOException {
    // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

    // Nutella icin arama yapin
    WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
    aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    // Sonuclarin Nutella icerdigini test edin
    WebElement sonucYaziElementi= driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
    String actualSonucYazisi =sonucYaziElementi.getText();
    String expectedIcerik = "Nutella";
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    // ve rapora eklenmek icin tum sayfanin fotografini cekin
       ReusableMethods.tumSayfaScreenshot(driver);

    }



}
