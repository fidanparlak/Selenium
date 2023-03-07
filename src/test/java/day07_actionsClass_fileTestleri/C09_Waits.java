package day07_actionsClass_fileTestleri;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_Waits {
    @Test
    public void amazonTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.//*[text()="It’s gone!"]
        driver.get("https://the-internet.herokuapp.com/dynamic_controls ");

        //4. Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click();

        //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        WebElement itsGone= driver.findElement(By.xpath("//p[@id='message']"));

        Assert.assertTrue(itsGone.isDisplayed());

        driver.close();


    }

}
