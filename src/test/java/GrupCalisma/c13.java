package GrupCalisma;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class c13 extends TestBase {
    @Test
    public void test() throws IOException {
        // youtube gidelim
        driver.get("https://youtube.com");
        driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[11]")).click();
        //trending bolumune jsexecutor kullanarak scroll yapin

        WebElement trends = driver.findElement(By.xpath("//span[text()='Trends']"));
        Actions actions=new Actions(driver);
        actions.scrollToElement(trends).perform();


     //   JavascriptExecutor jse = (JavascriptExecutor) driver;

      //xecuteScript("arguments[0].scrollIntoView();", trends);

        // o sayfanin  ekran gorunturusnu alin
        TakesScreenshot tkSs = (TakesScreenshot) driver;
        File alanGoruntusu = new File("target/ytSs.jpeg");

        File geciciData = tkSs.getScreenshotAs(OutputType.FILE);



        FileUtils.copyFile(geciciData, alanGoruntusu);
        // kapanmadan once alert seklinde  "islem basari ile tamamlandi" yazdirin.

     //   jse.executeScript("alert('islem basari ile tamamlandi.:::::))))))))')");

    }
    }