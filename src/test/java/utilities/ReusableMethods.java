package utilities;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableMethods {

    public static void tumSayfaScreenshot(WebDriver driver){

        TakesScreenshot ts = (TakesScreenshot) driver;

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        String dinamikDosyaYolu = "target/tumSayfaSs"+ ldt.format(dtf)+".png";

        // dosya yolu "target/tumSayfaSs20230227114813"
        File tumSayfaSs = new File(dinamikDosyaYolu);

        File geciciFile= ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(geciciFile,tumSayfaSs);
        } catch (IOException e) {

        }
    }

    public static void webelementScreenshot(WebElement istenenElement){
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
        String dinamikDosyaYolu = "target/webelementSs"+ ldt.format(dtf)+".png";

        File elementSs=new File(dinamikDosyaYolu);
        File geciciDosya=istenenElement.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(geciciDosya,elementSs);
        } catch (IOException e) {

        }

    }
}









