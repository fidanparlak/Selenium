package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("maximize :"+driver.manage().window().getSize()); //maximize :(1552, 832)
        System.out.println("maximize position :"+driver.manage().window().getPosition());//maximize position :(-8, -8)

        driver.manage().window().fullscreen();
        System.out.println("fullscreen size :"+driver.manage().window().getSize()); // fullscreen size :(1536, 864)
        System.out.println("fullscreen position :"+driver.manage().window().getPosition()); // fullscreen position :(0, 0)

driver.quit();
    }
}
