package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverNavigateMethodlari {
    public static void main(String[] args) {
        //System.setProperty("Webdriver.chrome.dreiver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasinaa gidin
        driver.get("https://www.amazon.com");

        // wisequarter anasayfaya gidin
        driver.get("https://www.wisequarter.com");

        // yeniden amazon anasayfaya gidin
        driver.navigate().back(); // bi onceki sayfaya doner

        // wisequarter anasayfaya donun
        driver.navigate().forward(); // tekrar ileri gider

        // navigate().to ==>  driver.get ile ayni islemi yapar
        driver.navigate().to("https://www.youtube.com");

        driver.navigate().refresh(); // sayfayi yeniler

        driver.quit();
    }
}
