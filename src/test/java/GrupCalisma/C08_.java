package GrupCalisma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

import static GrupCalisma.C05.driver;

public class C08_ {

    @Test
    public void Test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Wise quarter adseine gidin
        driver.get("https://www.wisequarter.com");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        // id si "zsiq_agtpic" olan chat objesi yuklenenne kadar bekleyin
        WebElement mesajIconu= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zsiq_agtpic")));
        mesajIconu.click();

        driver.switchTo().frame("siqiframe");

        // chat objesinin basarili bir sekilde yuklandigini ve ulasilabilir oldugunu test edin
        WebElement logo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"emptybg\"]/div[2]/em[2]")));

        Assert.assertTrue(logo.isDisplayed());
        driver.switchTo().parentFrame();

        Thread.sleep(2000);

        driver.close();
    }
    @Test
    public void test02(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // youtube sayfasina gidin
        driver.get("https://youtube.com");
        // butun cookies leri yazdirin
        Set<Cookie> ytCookie= driver.manage().getCookies();

        System.out.println("====================");

        int siraNo=1;
        for (Cookie eachCookie:ytCookie){
            System.out.println(siraNo+" : "+eachCookie.toString());
            siraNo++;
        }
        // tum cookies sayisinin 10 dan dusuk oldugunu test edin

        Assert.assertTrue(ytCookie.size()<10);

        // sayfanin tum cookielerinin siliniz
        driver.manage().deleteAllCookies();
        ytCookie=driver.manage().getCookies();

        Assert.assertTrue(ytCookie.size()==0);

        driver.close();
    }
    @Test
    public void test03(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //https://ultimateqa.com/simple-html-elements-for-automation/ sayfasina gidin
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        Actions actions=new Actions(driver);
        WebElement uniqueId=driver.findElement(By.xpath("//h2[text()='HTML Table with unique id']"));
        actions.scrollToElement(uniqueId).perform();


        WebElement table=driver.findElement(By.id("htmlTableId"));
        System.out.println(table.getText());
        //" HTML Table with unique id" baslikli WebTable da bulunan butun datalari yazdirin ve data

        // sayisinin 10 dan az oldugunu test edin


        driver.close();


}
}