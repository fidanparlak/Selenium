package day09_exel_screenshot_jsExecutor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C08_JavaScriptExecutorClick extends TestBase {
    @Test
    public void test01() {
        //wisequarter sayfasina gidelim
        driver.get("https://www.wisequarter.com");

        //refresh diyerek reklami gecin
        driver.navigate().refresh();
        // java test otomation tanitimina kadar asagi inin
        WebElement otomasyonElementi = driver.findElement(By.xpath("(//img[@alt='Automation Engineer'])[1]"));
        bekle(2);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", otomasyonElementi);
        jse.executeScript("arguments[0].click();", otomasyonElementi);

        // ekrana "JUnit bitti" yazdirin
        bekle(2);

        jse.executeScript("alert('JUnit Bitti');");
        bekle(3);

    }
}