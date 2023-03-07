package day02_webelements_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrom.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        System.out.println("Ilk size : "+driver.manage().window().getSize());//Ilk size : (1051, 798)
        System.out.println("Ilk position : "+driver.manage().window().getPosition());//Ilk position : (9, 9)

        //olculeri ve konumu degistirelim( acilan sayfalarin boyutlarini degistirdi)

        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(20,50));

        System.out.println("size : "+driver.manage().window().getSize());
        System.out.println("position : "+driver.manage().window().getPosition());





        Thread.sleep(2000);
        driver.close();



    }
}
