package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://wisequarter.com");
        System.out.println(driver.getWindowHandle());

        // CDwindow-682F52D9BBBE9868AD477E87901E11D4 ==> her calistirdigimizda farkli deger verir
        // CDwindow-2E25541CE03739B9B8F765C2E1C6B0BE
        // getWindowHandle() selenium tarafindan her driver sayfasi icin uretilen
        // uniqe handle degerini dondurur

        // getWindowHandles() ise test sirasinda birden fazla saya acilmissa
        // bir set olarak, tum sayfaalarin window handle degerlerini dondurur

        System.out.println(driver.getPageSource());

        // sayfe kodlari "2 hours weekly meeting with the team" iceriyormu test edin
        String expectedIcerik="2 hours weekly meeting with the team";
        String actualSayfaKodlari=driver.getPageSource();

        if (actualSayfaKodlari.contains(expectedIcerik)) {
            System.out.println("TEST PASSED!");

        }else {
            System.out.println("TEST FAIELD");
        }


        driver.quit();

        //close(); ve quit ikiside sayfa kapatmak icin kullanilir,
        // quit birden fazla sayfa kapatir
    }
}
