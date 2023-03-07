package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_FileExistTesti extends TestBase {
    @Test
    public void test01(){
    //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        //3. logo.png dosyasını indirelim //inspect ederiz sonra click
        driver.findElement(By.linkText("logo.png")).click();

        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim

        bekle(5);
        // Dosya downloadsa inecegi icin dinamik dosya yolu olusturalim/OneDrive
        String dinamikDosyaYolu=System.getProperty("user.home")+"/Dowloands/logo.png";

        Assert.assertFalse(Files.exists(Paths.get(dinamikDosyaYolu)));

    }
}
